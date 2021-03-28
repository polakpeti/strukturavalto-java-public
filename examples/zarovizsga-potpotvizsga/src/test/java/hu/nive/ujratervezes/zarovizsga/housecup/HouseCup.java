package hu.nive.ujratervezes.zarovizsga.housecup;

import javax.sql.DataSource;
import java.sql.*;
;

public class HouseCup {
    private DataSource dataSource;

    public HouseCup(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    int getPointsOfHouse(String house) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("select points_earned from house_points WHERE house_name = ?; ");
        ) {
            stmt.setString(1, house);
            ResultSet rs = stmt.executeQuery();
            int counter = 0;
            while (rs.next()) {
                String name = rs.getString("points_earned");
                counter += Integer.parseInt(name);
            }
            return counter;
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select employees", se);
        }
    }
}

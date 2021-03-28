package hu.nive.ujratervezes.zarovizsga.housecup;

import org.mariadb.jdbc.MariaDbDataSource;

public class HouseCup {
    MariaDbDataSource dataSource;

    public HouseCup(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    int getPointsOfHouse(String house){
        int counter = 30;
        return counter;
    }
}

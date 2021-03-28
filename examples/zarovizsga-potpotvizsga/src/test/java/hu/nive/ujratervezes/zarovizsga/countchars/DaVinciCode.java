package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DaVinciCode {

    public int encode(String filename, char c) throws IllegalArgumentException, IOException {
        int counter = 0;
        if (c == '0' || c == '1' || c == 'x') {
            Path path = Paths.get(filename);
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                String s = lines.get(i);
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == c) {
                        counter++;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
        return counter;
    }
}

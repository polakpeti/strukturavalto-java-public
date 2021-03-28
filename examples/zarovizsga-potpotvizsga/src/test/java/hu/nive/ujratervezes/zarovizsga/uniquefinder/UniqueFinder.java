package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {
    public List<Character> uniqueChars(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!characters.contains(s.charAt(i))) {
                characters.add(s.charAt(i));
            }
        }
        return characters;
    }
}

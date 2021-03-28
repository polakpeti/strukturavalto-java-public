package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Clownfish clownfish = new Clownfish("Nemo", 5, "orange-white");
        aquarium.addFish(clownfish);
        System.out.println(aquarium.getStatus());
    }
    public List<Fish> fishList = new ArrayList<>();

    public void addFish(Fish fish) {
        fishList.add(fish);
    }

    public void feed() {
        for (int i = 0; i < fishList.size(); i++) {
            fishList.get(i).feed();
        }
    }

    public void removeFish() {
        for (int i = 0; i < fishList.size(); i++) {
            if (fishList.get(i).getWeight() > 10) {
                fishList.remove(fishList.get(i));
            }
        }
    }

    public List<String> getStatus() {
        List<String> returnString = new ArrayList<>();
        for (int i = 0; i < fishList.size(); i++) {
            returnString.add(fishList.get(i).status());
        }
        return returnString;
    }
}

package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {
    String name;
    int weight;
    String color;

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }

    public void setMemoryLoss(boolean memoryLoss) {
        this.memoryLoss = memoryLoss;
    }

    boolean memoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void feed();

    public String status() {
        return name +
                ", weight: " + weight +
                ", color: " + color +
                ", short term memory loss: " + memoryLoss;
    }
}

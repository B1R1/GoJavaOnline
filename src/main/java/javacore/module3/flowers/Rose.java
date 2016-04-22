package javacore.module3.flowers;

public class Rose extends Flower {

    private String color;
    private String smellOfFlower;

    public Rose(String color, String smellOfFlower) {
        this.color = color;
        this.smellOfFlower = smellOfFlower;
    }

    @Override
    public String bloom() {
        return "Rose is blooming.";
    }

    @Override
    public String smell() {
        return "Rose is smelling.";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmellOfFlower() {
        return smellOfFlower;
    }

    public void setSmellOfFlower(String smellOfFlower) {
        this.smellOfFlower = smellOfFlower;
    }
}
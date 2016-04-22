package javacore.module3.flowers;

public class Aster extends Flower {
    private String color;
    private String smellOfFlower;

    public Aster(String color, String smellOfFlower) {
        this.color = color;
        this.smellOfFlower = smellOfFlower;
    }

    @Override
    public String bloom() {
        return "Aster is blooming.";
    }

    @Override
    public String smell() {
        return "Aster is smelling.";
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
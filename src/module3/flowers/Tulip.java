package module3.flowers;

public class Tulip extends Flower {
    private String color;
    private String smellOfFlower;

    public Tulip(String color, String smellOfFlower) {
        this.color = color;
        this.smellOfFlower = smellOfFlower;
    }

    @Override
    public String bloom() {
        return "Tulip is blooming.";
    }

    @Override
    public String smell() {
        return "Tulip is smelling.";
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
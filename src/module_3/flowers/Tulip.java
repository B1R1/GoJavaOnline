package module_3.flowers;

public class Tulip extends Flower {
    private String color;
    private String smellOfFlower;

    // constructors

    public Tulip() {
    }

    public Tulip(String color, String smellOfFlower) {
        this.color = color;
        this.smellOfFlower = smellOfFlower;
    }

    // methods

    @Override
    public String bloom() {
        return "Tulip is blooming.";
    }

    @Override
    public String smell() {
        return "Tulip is smelling.";
    }
    // getters & setters

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
package module_3.flowers;

public class Rose extends Flower {

    private String color;
    private String smellOfFlower;

    // constructors

    public Rose() {
    }

    public Rose(String color, String smellOfFlower) {
        this.color = color;
        this.smellOfFlower = smellOfFlower;
    }

    // methods

    @Override
    public String bloom() {
        return "Rose is blooming.";
    }

    @Override
    public String smell() {
        return "Rose is smelling.";
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
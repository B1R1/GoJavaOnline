package module_3.flowers;

public class Aster extends Flower {
    private String color;
    private String smellOfFlower;

    // constructors

    public Aster() {
    }

    public Aster(String color, String smellOfFlower) {
        this.color = color;
        this.smellOfFlower = smellOfFlower;
    }


    // methods

    @Override
    public String bloom() {
        return "Aster is blooming.";
    }

    @Override
    public String smell() {
        return "Aster is smelling.";
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
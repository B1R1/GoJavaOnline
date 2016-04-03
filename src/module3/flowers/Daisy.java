package module3.flowers;

public class Daisy extends Flower {

    private String color;
    private String smellOfFlower;

    public Daisy(String color, String smellOfFlower) {
        this.color = color;
        this.smellOfFlower = smellOfFlower;
    }

    @Override
    public String bloom() {
        return "Daisy is blooming.";
    }

    @Override
    public String smell() {
        return "Daisy is smelling.";
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

package module_3.flowers;

public class Diasy extends Flower {

    private String color;
    private String smellOfFlower;

    public Diasy(String color, String smellOfFlower) {
        this.color = color;
        this.smellOfFlower = smellOfFlower;
    }

    @Override
    public String bloom() {
        return "Diasy is blooming.";
    }

    @Override
    public String smell() {
        return "Diasy is smelling.";
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

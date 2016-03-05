package module_3_4.flowers;

public class Flower {
    private String color;
    private String smellOfFlower;

    public String bloom()  {
        return "Flower is blooming.";
    }

    public String smell()  {
        return "Flower is smelling.";
    }

    // getters & setters

    public String getColor() {
        return color;
    }

    public String getSmellOfFlower() {
        return smellOfFlower;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSmellOfFlower(String smellOfFlower) {
        this.smellOfFlower = smellOfFlower;
    }
}

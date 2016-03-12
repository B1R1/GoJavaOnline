package module_6.flowers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Diasy extends Flower {

    private String color;
    private String smellOfFlower;

    // constructors

    public Diasy() {
    }

    public Diasy(String color, String smellOfFlower) {
        this.color = color;
        this.smellOfFlower = smellOfFlower;
    }

    // methods
    @Override
    public String bloom() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("What is the correct type of flower?. You have only 1 chance, so try to guess: ... ");

            String typeOfFlower = reader.readLine();
            if (typeOfFlower.equals("Diasy"))
            {
                System.out.println("You're right, brilliant job.");
            }
            return "Diasy is blooming.";
        } catch (IOException e) {
            System.out.println("You're wrong, the worst job.");
            return "Diasy does not blooming.";
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error: \'reader\' is still open.");
            }
        }
    }

    @Override
    public String smell() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please, type some line with \"Diasy\".");
            String line = scanner.nextLine();
            if (!line.contains("Diasy"))
            {
                throw new WrongTypeException();
            }
            return "Rose is smell";
        } catch (WrongTypeException e) {
            return "Error: not \"Diasy\" type of flower.";
        }
        finally {
            scanner.close();
        }
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
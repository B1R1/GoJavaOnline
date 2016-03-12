package module_6.flowers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("What is the correct type of flower?. You have only 1 chance, so try to guess: ... ");

            String typeOfFlower = reader.readLine();
            if (typeOfFlower.equals("Tulip"))
            {
                System.out.println("You're right, brilliant job.");
            }
            return "Tulip is blooming.";
        } catch (IOException e) {
            System.out.println("You're wrong, the worst job.");
            return "Tulip does not blooming.";
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
            System.out.println("Please, type some line with \"Tulip\".");
            String line = scanner.nextLine();
            if (!line.contains("Tulip"))
            {
                throw new WrongTypeException();
            }
            return "Tulip is smell";
        } catch (WrongTypeException e) {
            return "Error: not \"Tulip\" type of flower.";
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
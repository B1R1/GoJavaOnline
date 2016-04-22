package javacore.module6.instruments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Order {

    public void create (Map<Instrument, List<Instrument>> map) {

        System.out.print("\n\nPlease, create order. ");

        fillPianos(map);

        fillGuitars(map);

        fillTrumpets(map);
    }

    private static void fillPianos(Map<Instrument, List<Instrument>> map) {
        List <Instrument> pianos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int amount;
        System.out.println("Enter pianos amount to order: ");
        amount = scanner.nextInt();
        for (int i = amount; i > 0; i--) {
            pianos.add(new Piano());
        }
        map.put(new Piano(), pianos);
    }

    private static void fillGuitars (Map<Instrument, List<Instrument>> map) {
        List <Instrument> guitars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int amount;
        System.out.println("Enter guitars amount to order: ");
        amount = scanner.nextInt();
        for (int i = amount; i > 0; i--) {
            guitars.add(new Guitar());
        }
        map.put(new Guitar(), guitars);
    }

    private static void fillTrumpets (Map<Instrument, List<Instrument>> map) {
        List <Instrument> trumpets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int amount;
        System.out.println("Enter trumpets amount to order: ");
        amount = scanner.nextInt();
        for (int i = amount; i > 0; i--) {
            trumpets.add(new Trumpet());
        }
        map.put(new Trumpet(), trumpets);
    }

    public void printOrder (Map<Instrument, List<Instrument>> map) {
        System.out.print("\nOrder has such instruments: ");
        for (Map.Entry<Instrument, List<Instrument>> entry : map.entrySet()) {
            System.out.print(entry.getValue());
        }
        System.out.println();
        System.out.println();
    }
}

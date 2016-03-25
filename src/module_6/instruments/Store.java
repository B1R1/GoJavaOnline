package module_6.instruments;

import java.util.*;

class Store {

    private static final int PIANOS = 3;
    private static final int GUITARS = 3;
    private static final int TRUMPETS = 3;

    private static final List<Instrument> store = new ArrayList<>();

    public Store() {
        fillStore();
    }

    public void manage (Map <Instrument, List<Instrument>> map) {
        for (Map.Entry<Instrument, List<Instrument>> order : map.entrySet()) {

            Instrument instrumentType = order.getKey();

            int instrumentsToRemove = order.getValue().size();
            int instrumentsRemoved = 0;

            for (Instrument instrument : store) {
                if (instrument.getType().equals(instrumentType.getType()) && instrumentsRemoved < instrumentsToRemove) {
                    instrumentsRemoved++;
                    System.out.println(instrumentType.getType() + " - ready for sending.");
                }
            }
            if (instrumentsRemoved < instrumentsToRemove) {
                try {
                    throw new IllegalArgumentException();
                } catch (IllegalArgumentException e) {
                    System.out.println("\nError: store doesn't have enough " +
                            instrumentType.getType() + "s");
                    break;
                }
            }
        }
    }

    private static void fillStore() {
        for (int i = 0; i < PIANOS; i++) {
            Store.store.add(new Piano());
        }

        for (int i = 0; i < GUITARS; i++) {
            Store.store.add(new Guitar());
        }

        for (int i = 0; i < TRUMPETS; i++) {
            Store.store.add(new Trumpet());
        }
    }

    public void printStore() {
        System.out.print("Store has such instruments: ");
        for (Instrument st : store) {
            System.out.print(st + " ");
        }
    }
}



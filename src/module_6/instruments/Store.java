package module_6.instruments;

import java.util.*;

public class Store {

    static int pianoAmount = 2;
    static int guitarAmount = 16;
    static int trumpetAmount = 7;

    static List<Instrument> instruments = new ArrayList<>();

    public List<Instrument> fillListOfInstruments() {

        for (int i = 0; i < pianoAmount; i++) {
            instruments.add(new Piano());
        }

        for (int i = 0; i < guitarAmount; i++) {
            instruments.add(new Guitar());
        }

        for (int i = 0; i < trumpetAmount; i++) {
            instruments.add(new Trumpet());

        }
        return instruments;
    }

    public List<Instrument> prepareInstruments(Map<String, Integer> order) {

        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String instrumentTypeInOrder = orderEntry.getKey();
            Integer numberOfInstrumentsInOrder = orderEntry.getValue();
            int numberOfInstrumentsRemoved = 0;

            for (int i = 0; i < instruments.size(); i++) {
                if (instruments.get(i).getType().equals(instrumentTypeInOrder) &&
                        numberOfInstrumentsInOrder > numberOfInstrumentsRemoved) {
                    try {
                        instruments.remove(i);
                        numberOfInstrumentsRemoved++;
                    } catch (IllegalStateException e) {
                        System.out.println("Error: in store doesn't exist such amount og needed instruments.");
                    }
                    numberOfInstrumentsRemoved++;
                } else if (!instruments.get(i).getType().equals(instrumentTypeInOrder)) {
                    try {
                        throw new IllegalInstrumentException();
                    } catch (IllegalInstrumentException e) {
                        System.out.println("Error: Incorrect type of instrument in order.");
                    }
                }
            }
        }
        return instruments;
    }
}



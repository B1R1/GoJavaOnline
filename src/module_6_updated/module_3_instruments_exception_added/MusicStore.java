package module_6_updated.module_3_instruments_exception_added;
/*
Домашнее задание к Модулю 6

2. Добавить в магазин инструментов метод, который готовит к отгрузке партию музыкальных инструментов согласно заказу.
Сигнатура метода:
public List<Instrument> prepareInstruments(Map<String, Integer> order){...}
В заказе (Map<String, Integer> order) хранится название инструмента и количество необходимых инструментов.
Ключем в заказе является одна из строк "piano", "guitar", "trumpet"
Создать свое исключение, которое будет брошено в случае, когда ключ в заказе другой.
Каким-то образом (самостоятельно выбрать решение) обработать ситуацию, когда количество элементов в заказе отрицательное, нулевое.
После выполнения метода из магазина должны пропасть те инструменты, которые были отгружены.
В случае, когда количество запрашиваемых инструментов определенного типа больше, чем количество доступных инструментов в магазине,
 должно быть брошено исключение. Выбрать наиболее подходящее из доступных в стандартной библиотеке исключений
Пример:
в магазине было 2 фортепиано, 16 гитар и 7 труб.
пришел заказ на 7 гитар и 2 трубы.
после выполнения заказа в магазине осталось 2 фортепиано, 9 гитар и 5 труб
пришел заказ на 1 фортепиано
после выполнения заказа в магазине осталось 1 фортепиано, 9 гитар и 5 труб
пришел заказ на 1 фортепиано, 8 гитар и 6 труб
товар не был отгружен (было брошено исключение)
в магазине осталось 1 фортепиано, 9 гитар и 5 труб
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MusicStore {

    static int pianoAmount = 2;
    static int guitarAmount = 16;
    static int trumpetAmount = 7;

    static List<Instrument> instruments = new ArrayList<Instrument>();

    public static void main(String[] args) {
        List<Instrument> instruments = new ArrayList<Instrument>();

        for (int i = 0; i < pianoAmount; i++) {
            instruments.add(new Piano());
        }

        for (int i = 0; i < guitarAmount; i++) {
            instruments.add(new Guitar());
        }

        for (int i = 0; i < trumpetAmount; i++) {
            instruments.add(new Trumpet());
            Map<String, Integer> order = new HashMap<String, Integer>();

            Order firstOrder = new Order();

            for (int index = 0; index < 9; index++) {
                firstOrder.createOrder(order);
                prepareInstruments(order);
            }
        }
    }

        public static List<Instrument> prepareInstruments(Map<String, Integer> order){

            System.out.println("1st step: check correctness of items of Instruments...");

            try {
                for (Map.Entry<String, Integer> entry : order.entrySet()) {
                    if (!entry.getKey().equals("Piano") && !entry.getKey().equals("Guitar") && entry.getKey().equals("Trumpet")) {
                        throw new IllegalInstrumentItemsException();
                    }
                }
            } catch (IllegalInstrumentItemsException e) {
                System.out.println("Error: not our item of instrument in order");
            }

            System.out.println("2st step: check the amount of Instruments...");

            for (Map.Entry<String, Integer> entry : order.entrySet()) {
                if (entry.getKey().equals("Piano")) {
                    if (entry.getValue() > pianoAmount) {
                        System.out.println("Not enough pianos in music store. Sorry");
                        break;
                    } else {
                        System.out.println("Pianos is ready to sending.");
                        pianoAmount = pianoAmount - entry.getValue();
                    }
                } else if (entry.getKey().equals("Giutar")) {
                    if (entry.getValue() > guitarAmount) {
                        System.out.println("Not enough guitars in music store. Sorry");
                        break;
                    } else {
                        guitarAmount = guitarAmount - entry.getValue();
                        System.out.println("Guitars is ready to sending.");
                    }
                } else if (entry.getKey().equals("Trumpet")) {
                    if (entry.getValue() > trumpetAmount) {
                        System.out.println("Not enough trumpets in music store. Sorry");
                        break;
                    } else {
                        trumpetAmount = trumpetAmount - entry.getValue();
                        System.out.println("Trumpets is ready to sending.");
                    }
                }
            }
            System.out.println("Order is ready to sending.");
            return MusicStore.instruments;
        }
    }


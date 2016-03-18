package module_6_updated.module_3_instruments_exception_added;

import java.util.Map;

public class Order {
    static int pianoAmountInOrder = (int) (Math.random()*3);
    static int guitarAmountInOrder = (int) (Math.random()*5);
    static int trumpetAmountInOrder = (int) (Math.random()*3);

    public void createOrder(Map<String, Integer> map) {
        map.put("Piano", pianoAmountInOrder);
        map.put("Guitar", guitarAmountInOrder);
        map.put("Trumpet", trumpetAmountInOrder);
    }
}

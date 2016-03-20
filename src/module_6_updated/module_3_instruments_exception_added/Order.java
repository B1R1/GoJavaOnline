package module_6_updated.module_3_instruments_exception_added;

import java.util.Map;

public class Order {
    int pianoAmountInOrder = (int) (Math.random()*3);
    int guitarAmountInOrder = (int) (Math.random()*5);
    int trumpetAmountInOrder = (int) (Math.random()*3);

    public void createOrder(Map<String, Integer> map) {
        map.put("Piano", pianoAmountInOrder);
        map.put("Guitar", guitarAmountInOrder);
        map.put("Trumpet", trumpetAmountInOrder);
    }
}

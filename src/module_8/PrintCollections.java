package module_8;

import module_6.module_4_exception_added.areas_of_geometric_shapes.Shape;

import java.util.List;

public class PrintCollections {
    public void print (List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " " +  list.get(i));
        }
    }


}


//    Создать класс, который печатает созданные коллекции на экран в виде таблицы. Колонки таблицы соответствуют полям объектов.
//        Каждая строка в таблице соответствует объекту из коллекции.
package module_8;

import module_6.geometric_shapes.*;

import java.util.List;

public class ListSorter {

    public List sort (List <Shape> list) throws NegativeValueException {
        Shape temp;
        for (int i = list.size() - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (list.get(j).calculateArea() > list.get(j+1).calculateArea())
                {
                    temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        } return list;
    }
}


package codegym;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstOddNumberTest {
    FirstOddNumber firstOddNumber = new FirstOddNumber();

    @Test
    public void testFind() throws Exception {
        int[]i = { 0, 3, };
//        int [] i = new int[3];
//        i[1] = 3;
        int expected = 0;

        int result = firstOddNumber.find(i);
        for (int d : i) {
            System.out.println(d);
        }

        assertEquals (expected, result);

    }
}
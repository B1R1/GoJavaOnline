package codegym.practice2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AverageNumberTest {

    AverageNumber number = new AverageNumber();

    @Test
    public void testAverage() throws Exception {
        int a = 4;
        int b = 6;
        int expected = 5;

        assertEquals(expected, number.average(a, b));
    }

    @Test
    public void testAverage2() throws Exception {
        int a = -4;
        int b = -7;
        int expected = -5;

        assertEquals(expected, number.average(a, b));
    }

    @Test
    public void testAverage3() throws Exception {
        int a = -2147483648;
        int b = -2;
        int expected = -1073741825;

        assertEquals(expected, number.average(a, b));
    }
}
package codegym.practice2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositiveAverageNumberTest {

    PositiveAverageNumber number = new PositiveAverageNumber();
    @Test
    public void testAverage() throws Exception {
        int a = 4;
        int b= 7;
        int expected = 5;

        assertEquals(expected, number.average(a, b));
    }

    @Test
    public void testAverage2() throws Exception {
        int a = 7;
        int b= 7;
        int expected = 7;

        assertEquals(expected, number.average(a, b));
    }
}
package codegym;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumDigitsTest {
    SumDigits sumDigits = new SumDigits();

    @Test
    public void testSum() throws Exception {
        int number = 123;
        int expected = 6;
        int result = sumDigits.sum(number);
        assertEquals (expected, result);
    }

    @Test
    public void testSumNegativeNumber() throws Exception {
        int number = -256;
        int expected = 13;
        int result = sumDigits.sum(number);
        assertEquals (expected, result);
    }
}
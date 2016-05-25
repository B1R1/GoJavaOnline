package codegym.practice3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LongestStabilityPeriodTest {

    LongestStabilityPeriod period = new LongestStabilityPeriod();

    @Test
    public void testCount() throws Exception {
        int [] input = {1000, 2000, 2001, 2000, 2001, 5000, 5000 };
        int expected = 4;
        assertEquals(expected, period.count(input));
    }

    @Test
    public void testCount2() throws Exception {
        int [] input = {900, 901, 902};
        int expected = 2;
        assertEquals(expected, period.count(input));
    }

    @Test
    public void testCount3() throws Exception {
        int [] input = {900, 900, 900, 901, 902, 902, 903, 903};
        int expected = 4;
        assertEquals(expected, period.count(input));
    }

    @Test
    public void testCount4() throws Exception {
        int [] input = {902, 902, 901, 902, 902, 903, 902, 902, 901, 902, 901, 901, 902, 903};
        int expected = 7;
        assertEquals(expected, period.count(input));
    }

}
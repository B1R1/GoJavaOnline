package codegym.practice5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KmpSmallestPeriodTest {

    KmpSmallestPeriod k = new KmpSmallestPeriod();

    @Test
    public void testFindSmalletstPeriod() throws Exception {
        String input = "abcabcabcabc";
        String expected = "abc";

        assertEquals(expected, k.findSmalletstPeriod(input));
    }

    @Test
    public void testFindSmalletstPeriod2() throws Exception {
        String input = "abdabcabdabc";
        String expected = "abdabc";

        assertEquals(expected, k.findSmalletstPeriod(input));
    }
}
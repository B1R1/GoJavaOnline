package codegym.practice2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountBitsTest {

    CountBits bits = new CountBits();

    @Test
    public void testCount() throws Exception {

        int input = 13;
        int expected = 3;

        assertEquals(expected, bits.count(input));
    }
}
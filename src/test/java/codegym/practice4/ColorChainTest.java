package codegym.practice4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColorChainTest {

    ColorChain chain = new ColorChain();

    @Test
    public void testCount() throws Exception {
        int input = 4;
        int expected = 100;

        assertEquals(expected, chain.count(input));
    }
}
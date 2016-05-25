package codegym.practice2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetZeroTest {

    SetZero setZero = new SetZero();

    @Test
    public void testSet() throws Exception {
        int input = 6;
        int bit = 2;
        int expected = 4;

        assertEquals(expected, setZero.set(6, 2));

    }
}
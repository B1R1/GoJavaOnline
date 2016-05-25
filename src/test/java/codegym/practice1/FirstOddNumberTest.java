package codegym.practice1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstOddNumberTest {
    FirstOddNumber firstOddNumber = new FirstOddNumber();

    @Test
    public void testFind() throws Exception {
        int[]i = {2, 4, 4, 6, 8, 9, 4, 1, };
        int expected = 5;
        int result = firstOddNumber.find(i);
        assertEquals (expected, result);

    }
}
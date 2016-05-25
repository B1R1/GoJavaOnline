package codegym.practice1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Satellite on 4/22/2016.
 */
public class FindMaxNumberTest {
    FindMaxNumber findMaxNumber = new FindMaxNumber();

    @Test
    public void testMax() throws Exception {
        int [] i = { 1, 2, 5, 3, };
        int expected = 5;
        int result = findMaxNumber.max(i);

        assertEquals (expected, result);
    }
}
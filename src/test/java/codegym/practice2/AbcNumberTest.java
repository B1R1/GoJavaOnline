package codegym.practice2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AbcNumberTest {
    AbcNumber number = new AbcNumber();

    @Test
    public void testConvert() throws Exception {
        String line = "bcd";
        int expected = 123;

        assertEquals(expected, number.convert(line));
    }
}
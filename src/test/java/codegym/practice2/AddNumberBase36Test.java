package codegym.practice2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddNumberBase36Test {

    AddNumberBase36 base36 = new AddNumberBase36();

    @Test
    public void testAdd() throws Exception {
        String a = "9";
        String b = "1";
        String expected = "a";
        String result = base36.add(a, b);

        assertEquals(expected,result);
    }

    @Test
    public void testAdd2() throws Exception {
        String a = "z";
        String b = "1";
        String expected = "10";
        String result = base36.add(a, b);

        assertEquals(expected,result);
    }
}
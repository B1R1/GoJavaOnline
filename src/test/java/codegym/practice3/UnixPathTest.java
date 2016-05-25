package codegym.practice3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnixPathTest {

    UnixPath u = new UnixPath();
    @Test
    public void testSimplify() throws Exception {
        String input = "/.";
        String expected = "/";
        assertEquals(expected, u.simplify(input));
    }

    @Test
    public void testSimplify2() throws Exception {
        String input = "/var//lib/";
        String expected = "/var/lib";
        assertEquals(expected, u.simplify(input));
    }

    @Test
    public void testSimplify3() throws Exception {
        String input = "//";
        String expected = "/";
        assertEquals(expected, u.simplify(input));
    }

    @Test
    public void testSimplify4() throws Exception {
        String input = "/var/lib/../log/./../tmp/data///.";
        String expected = "/var/tmp/data";
        assertEquals(expected, u.simplify(input));
    }
}
//        Input: "/."
//        Expected: "/"
//        Actual: "/."


//        Input: "/var//lib/"
//        Expected: "/var/lib"
//        Actual: "/var/lib/"
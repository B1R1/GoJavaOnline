package codegym.practice1;

import org.junit.Assert;
import org.junit.Test;

public class JoinCharactersTest {

    JoinCharacters joinCharacters = new JoinCharacters();

    @Test
    public void testOneElementOfArray() throws Exception {
        char[] input = {'1'};
        int expected = 1;
        int actualResult = joinCharacters.join(input);

        Assert.assertEquals(" Character should be joined correctly for single element array",
                expected, actualResult);
    }

    @Test
    public void testThreeElementsOfArray() throws Exception {
        char[] input = {'1', '2', '3'};
        int expected = 123;
        int actualResult = joinCharacters.join(input);

        Assert.assertEquals(" Character should be joined correctly for three elements of array",
                expected, actualResult);
    }

    @Test
    public void testEmptyArray() throws Exception {
        char[] input = {};
        int expected = 0;
        int actualResult = joinCharacters.join(input);

        Assert.assertEquals(" Character should be joined correctly for empty array",
                expected, actualResult);
    }

    @Test (expected = NullPointerException.class)
    public void testNullArray() throws Exception {
        char[] input = null;
        int expected = 0;
        int actualResult = joinCharacters.join(input);

        Assert.assertEquals(" Character should be joined correctly for null array",
                expected, actualResult);
    }

    @Test (expected = NullPointerException.class)
    public void testSingleElementZero() throws Exception {
        char[] input = {'0'};
        int expected = 0;
        int actualResult = joinCharacters.join(input);

        Assert.assertEquals(" Character should be joined correctly for one zero element in array",
                expected, actualResult);
    }

}
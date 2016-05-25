package codegym.practice1;

import codegym.practice1.MatrixTraversal;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class MatrixTraversalTest {

    MatrixTraversal matrixTraversal = new MatrixTraversal();

    @Test
    public void testEmptyMatrix() throws Exception {
        int [][]i = new int[0][];
        int [] expected = new int []{};
        int [] result = matrixTraversal.print(i);
        assertArrayEquals (expected, result);
    }

    @Test
    public void testOneElementMatrix() throws Exception {
        int [][]i = {{1}};
        int [] expected = {1};
        int [] result = matrixTraversal.print(i);
        assertArrayEquals (expected, result);
    }

    @Test
    public void testSquareMatrix() throws Exception {
        int [][]i = {{1, 2, 3, 4},
                     {5, 6, 7, 8},
                     {9, 10, 11, 12},
                     {13, 14, 15, 16}};
        int [] expected = {1, 2, 3, 4, 8, 12, 16, 15, 14,
                13, 9, 5, 6, 7, 11, 10};
        int [] result = matrixTraversal.print(i);

        System.out.println(Arrays.toString(result));

        assertArrayEquals (expected, result);
    }

    @Test
    public void testSquareMatrix2() throws Exception {
        int [][]i = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9},
                     {10, 11, 12}};
        int [] expected = {1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8,};
        int [] result = matrixTraversal.print(i);

        System.out.println(Arrays.toString(result));

        assertArrayEquals (expected, result);
    }
}
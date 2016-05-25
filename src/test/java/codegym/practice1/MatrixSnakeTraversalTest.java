package codegym.practice1;

import codegym.practice1.MatrixSnakeTraversal;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class MatrixSnakeTraversalTest {

    MatrixSnakeTraversal matrixSnakeTraversal =
            new MatrixSnakeTraversal();

    @Test
    public void testEmptyMatrix() throws Exception {
        int [][]i = new int[0][];
        int [] expected = new int []{};
        int [] result = matrixSnakeTraversal.print(i);
        assertArrayEquals (expected, result);
    }

    @Test
    public void testOneElementMatrix() throws Exception {
        int [][]i = {{1}};
        int [] expected = {1};
        int [] result = matrixSnakeTraversal.print(i);
        assertArrayEquals (expected, result);
    }

    @Test
    public void testSquareMatrix() throws Exception {
        int [][]i = {{1, 2, 3, 4},
                     {5, 6, 7, 8},
                     {9, 10, 11, 12}};
        int [] expected = {1, 5, 9, 10, 6, 2, 3, 7, 11, 12, 8, 4};
        int [] result = matrixSnakeTraversal.print(i);

        System.out.println(Arrays.toString(result));

        assertArrayEquals (expected, result);
    }

//    @Test
//    public void testNotSquareMatrix() throws Exception {
//        int [][]i = {{1, 2, 3},
//                     {4, 5, 6, 7},
//                     {8, 9, 10, 11, 12}};
//        int [] expected = {1, 4, 8, 9, 5, 2, 3, 6, 10, 11, 7, 12};
//        int [] result = matrixSnakeTraversal.print(i);
//
//        assertArrayEquals (expected, result);
//    }
}
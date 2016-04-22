package codegym;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MatrixSnakeTraversalTest {

    MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();

    @Test
    public void testPrint() throws Exception {
        int [][]i = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        int [] expected = {1, 4, 7, 8, 5, 2, 3, 6, 9};
        int [] result = MatrixSnakeTraversal.print(i);

        assertEquals (expected, result);

    }
}
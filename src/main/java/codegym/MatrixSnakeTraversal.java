package codegym;

import java.util.ArrayList;
import java.util.List;

public class MatrixSnakeTraversal {

    public static void main(String[] args) {
        int[][] i = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[] result = new int[10];
        result = print(i);
        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j] + " ");
        }
    }

    public static int[] print(int[][] input) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < input[i].length; j++) {
                    list.add(input[i][j]);
                }
            } else {
                for (int j = input[i].length; j > 0; j--) {
                    list.add(input[i][j]);
                }
            }
        }

            int[] result = new int[list.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = list.get(i);
            }

            return result;
        }

}

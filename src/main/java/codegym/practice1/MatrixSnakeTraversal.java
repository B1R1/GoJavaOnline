package codegym.practice1;

public class MatrixSnakeTraversal {

    public int[] print(int[][] input) {

        if (input.length == 0)
            return new int []{};

        int [] result = new int[input.length * input[0].length];

        boolean direction = true;
        int index = 0;

        for (int i = 0; i <= input[0].length-1; i++) {
            if (direction) {
                for (int j = 0; j <= input.length-1; j++) {
                    result[index] = input[j][i];
                    index++;
                }
                direction = false;
            } else {
                for (int j = input.length-1; j>=0; j--) {
                    result[index] = input[j][i];
                    index++;
                }
                direction = true;
            }
         }

            return result;
    }
}

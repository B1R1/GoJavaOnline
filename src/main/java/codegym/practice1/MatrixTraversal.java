package codegym.practice1;

public class MatrixTraversal {
    public int[] print(int[][] input) {

        if (input.length == 0)
            return new int[]{};

        int[] result = new int[input.length * input[0].length];

        int index = 0;

        int row = input[0].length;
        int col = input.length;

        int x = 0;
        int y = 0;

        while (x < row && y < col) {
            for (int i = y; i < row; ++i) {
                result[index] = input[x][i];
                index++;
            }
            x++;

            for (int i = x; i < col; ++i) {
                result[index] = input[i][row - 1];
                index++;
            }
            row--;

            if (x < col) {
                for (int i = row - 1; i >= y; --i) {
                    result[index] = input[col - 1][i];
                    index++;
                }
                col--;
            }

            if (y < row) {
                for (int i = col - 1; i >= x; --i) {
                    result[index] = input[i][y];
                    index++;
                }
                y++;
            }
        }
        return result;
    }
}
package codegym;

public class FirstOddNumber {
    public int find(int[] input) {
        int result = -1;
        for (int i : input) {
            if (i % 2 != 0 || i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}

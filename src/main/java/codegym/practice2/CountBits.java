package codegym.practice2;

public class CountBits {
    public int count(int num) {
        int result = 0;
        char [] c = (Integer.toBinaryString(num)).toCharArray();
        for (char s : c) {
            if (s == '1') {
                result++;
            }
        }
        return result;
    }
}
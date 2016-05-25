package codegym.practice2;

public class AbcNumber {
    public int convert(String num) {
        //a = 97; 0 = 48;
        String res = "";
        char[]c = num.toCharArray();

        for (char i : c) {
            res += String.valueOf(i - 'a');
        }

        return Integer.valueOf(res);
    }
}

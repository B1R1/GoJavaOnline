package codegym.practice1;

public class JoinCharacters {
    public int join(char[] input) {
        String temp = "";
        for (char i : input) {
            temp += String.valueOf(i);
        }
        return Integer.valueOf(temp);
    }
//        int result = 0;
//        for (int i = 0; i < input.length; i++) {
//            result = result*10 + (input[i] - '0');
//        }
//        return result;
//    }
}

package codegym.practice1;

public class FirstOddNumber {
    public int find(int[] input) {

//        boolean mark = true;
        int result = -1;

            for (int i = 0; i <input.length; i++) {
//                if (mark == true) {
                if (input[i] % 2 != 0) {
                    result = i;
//                    mark = false;
                    break;
//                }
            }
        }
        return result;
    }
}

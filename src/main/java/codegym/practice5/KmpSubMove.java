package codegym.practice5;

public class KmpSubMove {

    public int subMoveQuantity(String inputStr, String resultStr) {

        if (inputStr == null) return -1;
        if (inputStr.length() == 1) return -1;

        if (!inputStr.contains(resultStr.substring(0,1))) return -1;
        

        return inputStr.indexOf(resultStr.substring(0,1)) + 1;
    }
}

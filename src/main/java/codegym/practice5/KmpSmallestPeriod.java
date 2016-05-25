package codegym.practice5;

public class KmpSmallestPeriod {

    public String findSmalletstPeriod(String input) {
        String result = "";
        if (input == null) return null;
        if (input.length() == 1) return input;

        for (int i = 1; i < input.length(); i++ ) {
            String subString = input.substring(0,i);
            String lastString = input.substring(i, i+i);

            if (subString.equals(lastString)) {
                return subString;
            }
        }
        return result;
    }
}

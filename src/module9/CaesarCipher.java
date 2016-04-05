package module9;

public class CaesarCipher {

    private static final int SHIFT_OF_LETTER = 10;

    public String encode(String line) {

        String encodedLine = "";

        if (notEmpty(line)) {

            char[] array = line.toCharArray();

            for (char item : array) {
                if (item >= 'A' && item <= 'Z') {
                    item = (char) (item + SHIFT_OF_LETTER);
                    if (item > 'Z') {
                        item = (char) (item - 26);
                    }
                } else if (item >= 'a' && item <= 'z') {
                    item = (char) (item + SHIFT_OF_LETTER);
                    if (item > 'z') {
                        item = (char) (item - 26);
                    }
                }
                encodedLine += item;
            }
        }
        return encodedLine;
    }

    public String decode(String encodedLine) {

        String decodedLine = "";

        if (notEmpty(encodedLine)) {

            char[] array = encodedLine.toCharArray();

            for (char anArray : array) {
                char letter = anArray;
                if (letter >= 'A' && letter <= 'Z') {
                    letter = (char) (letter - SHIFT_OF_LETTER);
                    if (letter < 'A') {
                        letter = (char) (letter + 26);
                    }
                } else if (letter >= 'a' && letter <= 'z') {
                    letter = (char) (letter - SHIFT_OF_LETTER);
                    if (letter < 'a') {
                        letter = (char) (letter + 26);
                    }
                }
                decodedLine += letter;
            }
        }
        return decodedLine;
    }

    private static boolean notEmpty (String line) {
        boolean notEmpty = true;
        if (line == null || line.equals("")) {
            notEmpty = false;
            System.out.println("Line can't be empty or null.");
        }
        return notEmpty;
    }
}
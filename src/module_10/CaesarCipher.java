package module_10;

class CaesarCipher {

    private static final int SHIFT_OF_LETTER = 10;

    public String encode(String line) {
        String encodedLine = "";
        char[] item = line.toCharArray();
        for (char anItem : item) {
            char letter = anItem;
            if (letter >= 'A' && letter <= 'Z') {
                letter = (char) ((int) letter + SHIFT_OF_LETTER);
                if (letter > 'Z') {
                    letter = (char) (letter - 26);
                }
                encodedLine += letter;
            } else if (letter >= 'a' && letter <= 'z') {
                letter = (char) ((int) letter + SHIFT_OF_LETTER);
                if (letter > 'z') {
                    letter = (char) (letter - 26);
                }
                encodedLine += letter;
            }
            else encodedLine += letter;
        }
        return encodedLine;
    }

    public String decode (String encodedLine) {
        String decodedLine = "";
        char[] item = encodedLine.toCharArray();
        for (char anItem : item) {
            char letter = anItem;
            if (letter >= 'A' && letter <= 'Z') {
                letter = (char) ((int) letter - SHIFT_OF_LETTER);
                if (letter < 'A') {
                    letter = (char) (letter + 26);
                }
                decodedLine += letter;
            }
            else if (letter >= 'a' && letter <= 'z') {
                letter = (char) ((int) letter - SHIFT_OF_LETTER);
                if (letter < 'a') {
                    letter = (char) (letter + 26);
                }
                decodedLine += letter;
            }
            else decodedLine += letter;
        }
        return decodedLine;
    }
}
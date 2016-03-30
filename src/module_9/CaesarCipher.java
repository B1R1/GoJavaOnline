package module_9;

import java.util.List;

class CaesarCipher {

    private static final int SHIFT_OF_LETTER = 10;

    public void encode(List<String> list, List<String> encodedList) {
        for (String item : list) {
            String line = "";
            char[] array = item.toCharArray();
            for (char anArray : array) {
                char letter = anArray;
                if (letter >= 'A' && letter <= 'Z') {
                    letter = (char) (letter + SHIFT_OF_LETTER);
                    if (letter > 'Z') {
                        letter = (char) (letter - 26);
                    }
                    line += letter;
                } else if (letter >= 'a' && letter <= 'z') {
                    letter = (char) (letter + SHIFT_OF_LETTER);
                    if (letter > 'z') {
                        letter = (char) (letter - 26);
                    }
                    line += letter;
                }
            }
            encodedList.add(line);
        }
    }

    public void decode(List<String> encodedList, List<String> list) {
        for (String item : encodedList) {
            String line = "";
            char[] array = item.toCharArray();
            for (char anArray : array) {
                char letter = anArray;
                if (letter >= 'A' && letter <= 'Z') {
                    letter = (char) (letter - SHIFT_OF_LETTER);
                    if (letter < 'A') {
                        letter = (char) (letter + 26);
                    }
                    line += letter;
                } else if (letter >= 'a' && letter <= 'z') {
                    letter = (char) (letter - SHIFT_OF_LETTER);
                    if (letter < 'a') {
                        letter = (char) (letter + 26);
                    }
                    line += letter;
                }
            }
            list.add(line);
            }
        }
    }

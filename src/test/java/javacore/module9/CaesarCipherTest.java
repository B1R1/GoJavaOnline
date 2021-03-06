package javacore.module9;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CaesarCipherTest {

    private static CaesarCipher caesarCipher;

    private final String line = "It's testing line!";
    private final String numbersLine = "12345678";
    private final String specialCharactersLine = "[*][#]";
    private final String spaceLine = " ";
    private final String emptyLine = "";
    private final String cyrillicLine = "Тестовая строка";
    private final String nullLine = null;
    private final String encodedLine = "Sd'c docdsxq vsxo!";

    @Rule
    public Timeout globalTimeout  = Timeout.millis(1000);

    @BeforeClass
    public static void setUpClass() {
        caesarCipher = new CaesarCipher();
    }

    @Test
    public void testEncode() throws Exception {
        final String result1 = caesarCipher.encode(line);
        final String result2 = caesarCipher.encode(numbersLine);
        final String result3 = caesarCipher.encode(specialCharactersLine);
        final String result4 = caesarCipher.encode(spaceLine);
        final String result5 = caesarCipher.encode(emptyLine);
        final String result6 = caesarCipher.encode(cyrillicLine);

        Assert.assertEquals(encodedLine, result1);
        Assert.assertEquals(numbersLine, result2);
        Assert.assertEquals(specialCharactersLine, result3);
        Assert.assertEquals(spaceLine, result4);
        Assert.assertEquals(emptyLine, result5);
        Assert.assertEquals(cyrillicLine, result6);
        Assert.assertNull(nullLine);
    }

    @Test
    public void testDecode() throws Exception {
        final String result1 = caesarCipher.decode(encodedLine);
        final String result2 = caesarCipher.encode(numbersLine);
        final String result3 = caesarCipher.encode(specialCharactersLine);
        final String result4 = caesarCipher.encode(spaceLine);
        final String result5 = caesarCipher.encode(emptyLine);
        final String result6 = caesarCipher.encode(cyrillicLine);

        Assert.assertEquals(line, result1);
        Assert.assertEquals(numbersLine, result2);
        Assert.assertEquals(specialCharactersLine, result3);
        Assert.assertEquals(spaceLine, result4);
        Assert.assertEquals(emptyLine, result5);
        Assert.assertEquals(cyrillicLine, result6);
        Assert.assertNull(nullLine);
    }
}
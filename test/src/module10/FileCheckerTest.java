package module10;

import org.junit.*;
import org.junit.rules.Timeout;
import java.io.File;
import static org.junit.Assert.*;

public class FileCheckerTest {

    @Rule
    public final Timeout globalTimeout = Timeout.millis(1000);

    @Test
    public void testGetFile()  {

        final String existFile = "c:\\src\\530.txt";

        final File file = FileChecker.getFile(existFile);

        assertTrue(file.exists());
    }

    @Test
    public void testGetNotExistFile() throws Exception {

        final String notExistFile = "c:\\src\\531.txt";

        final File file = FileChecker.getFile(notExistFile);

        assertTrue(file.exists());
    }

    @Test
    public void testGetNoTXTFile() throws Exception {

        final String notExistNotTXTFile = "c:\\src\\531.bmp";

        final File file = FileChecker.getFile(notExistNotTXTFile);

        assertTrue(file.exists());
    }

    @Test (expected = AssertionError.class)
    public void testGetNotExistDirectory() throws Exception {

        final String notExistDirectory = "c:\\531.txt";

        final File file = FileChecker.getFile(notExistDirectory);

        assertTrue(file.exists());
    }
}
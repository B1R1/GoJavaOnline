package javacore.module10;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.io.File;

public class FileCheckerTest {

    @Rule
    public final Timeout globalTimeout = Timeout.millis(1000);

    @Test
    public void testGetFile()  {

        final String existFile = "c:\\src\\530.txt";

        final File file = FileChecker.getFile(existFile);

        Assert.assertTrue(file.exists());
    }

    @Test
    public void testGetNotExistFile() throws Exception {

        final String notExistFile = "c:\\src\\531.txt";

        final File file = FileChecker.getFile(notExistFile);

        Assert.assertTrue(file.exists());
    }

    @Test
    public void testGetNoTXTFile() throws Exception {

        final String notExistNotTXTFile = "c:\\src\\531.bmp";

        final File file = FileChecker.getFile(notExistNotTXTFile);

        Assert.assertTrue(file.exists());
    }

    @Test (expected = AssertionError.class)
    public void testGetNotExistDirectory() throws Exception {

        final String notExistDirectory = "c:\\531.txt";

        final File file = FileChecker.getFile(notExistDirectory);

        Assert.assertTrue(file.exists());
    }
}
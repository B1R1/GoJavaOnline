package javacore.module9;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SampleDataListCreatorTest {

    private static final List<String> list = new ArrayList<>();

    @Test(timeout = 1000)
    public void testCreateList() {
        SampleDataListCreator.createList(list);
        final int result = list.size();
        Assert.assertEquals(3, result);
    }
}
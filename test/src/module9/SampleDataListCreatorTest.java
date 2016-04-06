package module9;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class SampleDataListCreatorTest {

    private static final List<String> list = new ArrayList<>();

    @Test(timeout = 1000)
    public void testCreateList() {
        SampleDataListCreator.createList(list);
        final int result = list.size();
        assertEquals(3, result);
    }
}
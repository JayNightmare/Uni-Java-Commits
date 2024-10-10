import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ArrayListDemoTest {

    @Test
    void testStringArrayList() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        assertTrue(stringList.contains("Apple"));
        stringList.remove("Apple");
        assertFalse(stringList.contains("Apple"));
    }

    @Test
    void testIntegerArrayList() {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        assertEquals(1, intList.size());
    }

    @Test
    void testDoubleArrayList() {
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        assertEquals(1.5, doubleList.get(0), 0.0);
    }
}

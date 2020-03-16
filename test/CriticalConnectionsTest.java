import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CriticalConnectionsTest {

    @Test
    void test1() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(0, 1)));
        list.add(new ArrayList<>(Arrays.asList(1, 2)));
        list.add(new ArrayList<>(Arrays.asList(2, 0)));
        list.add(new ArrayList<>(Arrays.asList(1, 3)));

        List<List<Integer>> result = CriticalConnections.criticalConnections(4, list);
        assertEquals(1, result.size());
    }

    @Test
    void test2() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(0, 1)));
        list.add(new ArrayList<>(Arrays.asList(0, 2)));
        list.add(new ArrayList<>(Arrays.asList(0, 3)));
        list.add(new ArrayList<>(Arrays.asList(1, 4)));
        list.add(new ArrayList<>(Arrays.asList(2, 4)));
        list.add(new ArrayList<>(Arrays.asList(4, 0)));

        List<List<Integer>> result = CriticalConnections.criticalConnections(5, list);
        assertEquals(1, result.size());
    }
}
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindNeedleInHaystackTest {

    @Test
    void test1() {
        List<Integer> result = FindNeedleInHaystack.grep("aaaaaa", "aa");
        assertEquals(5, result.size());
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(3, result.get(3));
        assertEquals(4, result.get(4));
    }

    @Test
    void test2() {
        List<Integer> result = FindNeedleInHaystack.grep("aaabcaaabgbgabcffee", "abc");
        assertEquals(2, result.size());
        assertEquals(2, result.get(0));
        assertEquals(12, result.get(1));
    }

    @Test
    void test3() {
        List<Integer> result = FindNeedleInHaystack.grep("aarterterterterte", "abc");
        assertEquals(0, result.size());
    }

    @Test
    void test4() {
        List<Integer> result = FindNeedleInHaystack.grep("barterterabcterte", "abc");
        assertEquals(1, result.size());
        assertEquals(9, result.get(0));
    }

    @Test
    void test5() {
        List<Integer> result = FindNeedleInHaystack.grep("AABAACAADAABAABA", "AABA");
        assertEquals(3, result.size());
        assertEquals(0, result.get(0));
        assertEquals(9, result.get(1));
        assertEquals(12, result.get(2));
    }

}
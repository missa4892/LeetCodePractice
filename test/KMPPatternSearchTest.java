import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KMPPatternSearchTest {

    @Test
    void test1() {
        List<Integer> result = KMPPatternSearch.grep("ababcabcabababd", "ababd");
        assertEquals(10, result.get(0));
    }

    @Test
    void test2() {
        List<Integer> result = KMPPatternSearch.grep("AABAACAADAABAABA", "AABA");
        assertEquals(0, result.get(0));
        assertEquals(9, result.get(1));
        assertEquals(12, result.get(2));
    }

    @Test
    void test3() {
        List<Integer> result = KMPPatternSearch.grep("AAAAAAAAA", "AAA");
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(3, result.get(3));
        assertEquals(4, result.get(4));
        assertEquals(5, result.get(5));
        assertEquals(6, result.get(6));
    }

    @Test
    void test4() {
        assertEquals(10, KMPPatternSearch.grep("ABABDABACDABABCABAB", "ABABCABAB").get(0));
    }

}
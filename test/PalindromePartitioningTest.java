import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningTest {

    @Test
    void test1() {
        assertEquals(2, PalindromePartitioning.minPalindromePartitioning("abcbm"));
    }

    @Test
    void test2() {
        assertEquals(1, PalindromePartitioning.minPalindromePartitioning("banana"));
    }

    @Test
    void test3() {
        assertEquals(0, PalindromePartitioning.minPalindromePartitioning("bb"));
    }

}
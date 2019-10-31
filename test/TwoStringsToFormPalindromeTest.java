import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoStringsToFormPalindromeTest {

    @Test
    void test1() {
        assertEquals(4, TwoStringsToFormPalindrome.splitPalindrome("abcdefgh", "xxxxdcba"));
    }

    @Test
    void test2() {
        assertEquals(3, TwoStringsToFormPalindrome.splitPalindrome("qwwf", "xasq"));
    }

    @Test
    void test3() {
        assertEquals(4, TwoStringsToFormPalindrome.splitPalindrome("qwewf", "xabcq"));
    }

    @Test
    void test4() {
        assertEquals(7, TwoStringsToFormPalindrome.splitPalindrome("ab12321xy", "**5***4ba"));
    }

    @Test
    void test5() {
        assertEquals(-1, TwoStringsToFormPalindrome.splitPalindrome("abwerwer", "abwerwea"));
    }

    @Test
    void test6() {
        assertEquals(1, TwoStringsToFormPalindrome.splitPalindrome("qaser", "qwwwq"));
    }
}
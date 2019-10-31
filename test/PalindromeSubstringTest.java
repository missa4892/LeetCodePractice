import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeSubstringTest {

    @Test
    void test1() {
        assertEquals(3, PalindromeSubstring.countSubstrings("abc"));
    }

    @Test
    void test2() {
        assertEquals(6, PalindromeSubstring.countSubstrings("aaa"));
    }

}
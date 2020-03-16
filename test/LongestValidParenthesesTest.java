import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {

    @Test
    void test1() {

        int result = LongestValidParentheses.longestValidParentheses("()(()");
        assertEquals(2, result);
    }

    @Test
    void test2() {

        int result = LongestValidParentheses.longestValidParentheses("()(())");
        assertEquals(6, result);
    }

    @Test
    void test3() {
        int result = LongestValidParentheses.longestValidParentheses(")((");
        assertEquals(6, result);
    }
}
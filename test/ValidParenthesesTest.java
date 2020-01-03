import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void test1() {
        boolean valid = ValidParentheses.isValid("()");
        assertTrue(valid);
    }

}
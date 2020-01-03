import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneAwayTest {

    @Test
    void test1() {
        assertTrue(OneAway.isOneAway("bay", "bat"));
    }

    @Test
    void test2() {
        assertTrue(OneAway.isOneAway("cat", "at"));
    }

    @Test
    void test3() {
        assertTrue(OneAway.isOneAway("bak", "bake"));
    }

    @Test
    void test4() {
        assertTrue(OneAway.isOneAway("the", "te"));
    }

}
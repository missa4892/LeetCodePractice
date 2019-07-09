import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonnaciTest {

    @Test
    void shouldReturnCorrectForEasy() {
        Fibonnaci fibonnaci = new Fibonnaci();
        assertEquals(2, fibonnaci.fib(3));
    }

    @Test
    void shouldReturnCorrectForEasyTwo() {
        Fibonnaci fibonnaci = new Fibonnaci();
        assertEquals(5, fibonnaci.fib(5));
    }

    @Test
    void shouldReturnCorrectForLargeNumber() {
        Fibonnaci fibonnaci = new Fibonnaci();
        assertEquals(6765, fibonnaci.fib(20));
    }

    @Test
    void shouldReturnCorrectForBottomUp() {
        Fibonnaci fibonnaci = new Fibonnaci();
        assertEquals(2, fibonnaci.bottom_up_dp(3));
    }

    @Test
    void shouldReturnCorrectForBottomUpTwo() {
        Fibonnaci fibonnaci = new Fibonnaci();
        assertEquals(5, fibonnaci.bottom_up_dp(5));
    }

    @Test
    void shouldReturnCorrectForLargeNumberBottomUp() {
        Fibonnaci fibonnaci = new Fibonnaci();
        assertEquals(Long.parseLong("12586269025"), fibonnaci.bottom_up_dp(50));
    }
}
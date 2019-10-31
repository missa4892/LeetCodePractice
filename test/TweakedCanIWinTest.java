import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TweakedCanIWinTest {

    @Test
    void test1() {
        int moves = TweakedCanIWin.canIWin(5, 15);
        assertEquals(6, moves);
    }

    @Test
    void test2() {
        int moves = TweakedCanIWin.canIWin(10, 38);
        assertEquals(8, moves);
    }

    @Test
    void test3() {
        int moves = TweakedCanIWin.canIWin(15, 116);
        assertEquals(16, moves);
    }

    @Test
    void test4() {
        int moves = TweakedCanIWin.canIWin(10, 11);
        assertEquals(-1, moves);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CanIWinTest {

    @Test
    void shouldReturnTrueWhenDesiredTotalIsLessThanMaxChooseableInt() {
        boolean canIWin = CanIWin.canIWin(10, 5);
        assertEquals(true, canIWin);
    }

    @Test
    void shouldReturnTrueWhenPlayerOneCanWin() {
        boolean canIWin = CanIWin.canIWin(10, 20);
        assertEquals(true, canIWin);
    }

    @Test
    void shouldReturnFalse() {
        boolean canIWin = CanIWin.canIWin(10, 11);
        assertEquals(false, canIWin);
    }

    @Test
    void shouldReturnTrue() {
        boolean canIWin = CanIWin.canIWin(15, 100);
        assertEquals(true, canIWin);
    }
}
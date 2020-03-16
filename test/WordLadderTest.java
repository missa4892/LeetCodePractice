import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WordLadderTest {

    @Test
    void test1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");
        int ladderLength = WordLadder.ladderLength("hit", "cog", list);
        assertEquals(5, ladderLength);
    }
}
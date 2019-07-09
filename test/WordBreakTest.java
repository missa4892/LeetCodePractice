import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordBreakTest {

    @Test
    void shouldReturnTrueWhenWordsExist(){

        WordBreak wordBreak = new WordBreak();

        boolean result = wordBreak.canWordBreak("leetcode", Arrays.asList("leet", "code"));

        assertTrue(result);

    }

    @Test
    void shouldReturnTrueWhenWordsAreReused(){

        WordBreak wordBreak = new WordBreak();

        boolean result = wordBreak.canWordBreak("applepenapple", Arrays.asList("apple", "pen"));

        assertTrue(result);

    }
}

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

class WordBreakIITest {

    WordBreakII spacesBetweenWords = new WordBreakII();

    @Test
    void shouldReturnWordsFromDictionary() {

        HashSet<String> dictionary = new HashSet<>();
        dictionary.add("cat");
        dictionary.add("cats");
        dictionary.add("and");
        dictionary.add("sand");
        dictionary.add("dog");

        List<String> result = spacesBetweenWords.canAddSpaces("catsanddog", dictionary);

        List<String> expected = Arrays.asList("cats and dog", "cat sand dog");

        assertThat(listEqualsIgnoreOrder(result, expected), Matchers.is(true));
    }

    @Test
    void shouldReturnWordsFromJumbledDictionary() {

        HashSet<String> dictionary = new HashSet<>();
        dictionary.add("cats");
        dictionary.add("dog");
        dictionary.add("sand");
        dictionary.add("and");
        dictionary.add("cat");

        List<String> result = spacesBetweenWords.canAddSpaces("catsandog", dictionary);

        List<String> expected = new ArrayList<>();

        assertThat(listEqualsIgnoreOrder(result, expected), Matchers.is(true));
    }

    @Test
    void shouldReturnEvenWhenReallyLongInput() {

        HashSet<String> dictionary = new HashSet<>();
        dictionary.add("a");
        dictionary.add("aa");
        dictionary.add("aaa");
        dictionary.add("aaaa");
        dictionary.add("aaaaa");
        dictionary.add("aaaaaa");
        dictionary.add("aaaaaaa");
        dictionary.add("aaaaaaaa");
        dictionary.add("aaaaaaaaa");
        dictionary.add("aaaaaaaaaa");
        dictionary.add("aaaaaaaaaaa");
        dictionary.add("aaaaaaaaaaaa");

        List<String> result = spacesBetweenWords.canAddSpaces("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", dictionary);

        List<String> expected = new ArrayList<>();

        assertThat(listEqualsIgnoreOrder(result, expected), Matchers.is(true));
    }

    @Test
    void shouldReturnWordsFromDictionaryForWordBreakSolution() {

        ArrayList<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("cats");
        dictionary.add("and");
        dictionary.add("sand");
        dictionary.add("dog");

        List<String> result = spacesBetweenWords.wordBreak("catsanddog", dictionary);

        List<String> expected = Arrays.asList("cats and dog", "cat sand dog");

        assertThat(listEqualsIgnoreOrder(result, expected), Matchers.is(true));
    }

    @Test
    void shouldReturnWordsFromDictionaryForWordBreakSolution2() {

        ArrayList<String> dictionary = new ArrayList<>();
        dictionary.add("apple");
        dictionary.add("pen");
        dictionary.add("applepen");
        dictionary.add("pine");
        dictionary.add("pineapple");

        List<String> result = spacesBetweenWords.wordBreak("pineapplepenapple", dictionary);

        List<String> expected = Arrays.asList("pine apple pen apple", "pineapple pen apple", "pine applepen apple");

        assertThat(listEqualsIgnoreOrder(result, expected), Matchers.is(true));
    }

    @Test
    void shouldWorkForLongInputsWithWordBreakSolution() {
        ArrayList<String> dictionary = new ArrayList<>();
        dictionary.add("a");
        dictionary.add("aa");
        dictionary.add("aaa");
        dictionary.add("aaaa");
        dictionary.add("aaaaa");
        dictionary.add("aaaaaa");
        dictionary.add("aaaaaaa");
        dictionary.add("aaaaaaaa");
        dictionary.add("aaaaaaaaa");
        dictionary.add("aaaaaaaaaa");
        dictionary.add("aaaaaaaaaaa");
        dictionary.add("aaaaaaaaaaaa");

        List<String> result = spacesBetweenWords.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", dictionary);

        List<String> expected = new ArrayList<>();

        assertThat(listEqualsIgnoreOrder(result, expected), Matchers.is(true));
    }

    public static <T> boolean listEqualsIgnoreOrder(List<T> list1, List<T> list2) {
        return new HashSet<>(list1).equals(new HashSet<>(list2));
    }
}

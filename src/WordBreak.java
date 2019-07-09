import java.util.HashSet;
import java.util.List;

public class WordBreak {

    public boolean canWordBreak(String s, List<String> wordDict) {

        HashSet<String> dictSet = convertToSet(wordDict);
        return false;

    }

    private HashSet<String> convertToSet(List<String> wordDict) {
        HashSet<String> set = new HashSet<>();

        for (String word: wordDict) {
            set.add(word);
        }
        return set;
    }

}

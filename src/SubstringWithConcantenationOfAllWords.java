import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcantenationOfAllWords {

    public static void main(String[] args){

        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};

        List<Integer> result = findSubstring(s, words);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    private static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if(words.length == 0 || words[0].length() == 0){
            return result;
        }

        Map<String, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                int count = wordsMap.get(word);
                count++;
                wordsMap.put(word, count);
            } else {
                wordsMap.put(word, 1);
            }
        }

        int sizeOfWord = words[0].length();
        int totalSizeOfWords = words.length * sizeOfWord;
        int endIndexOfInput = totalSizeOfWords;

        for (int i = 0; i <= s.length() - totalSizeOfWords; i++) {

            String inputSubstring = s.substring(i, endIndexOfInput);

            int startIndex = 0;
            int endIndex = startIndex + sizeOfWord;
            Map<String, Integer> tempMap = new HashMap<>(wordsMap);

            while(endIndex <= totalSizeOfWords){
                String subsubString = inputSubstring.substring(startIndex, endIndex);
                if(tempMap.containsKey(subsubString)){
                    int count = tempMap.get(subsubString);
                    count--;
                    tempMap.put(subsubString, count);
                } else {
                    break;
                }
                startIndex += sizeOfWord;
                endIndex += sizeOfWord;
            }

            int count = 0;
            for (Map.Entry<String, Integer> item : tempMap.entrySet()) {
                if (item.getValue() > 0) {
                    count++;
                }
                if(count > 0){
                   break;
                }
            }
            if(count == 0){
                result.add(i);
            }
            endIndexOfInput++;
        }

        return result;
    }


//    private static List<Integer> findSubstring(String s, String[] words) {
//
//        int lengthOfWord = words[0].length();
//
//        Map<Integer, String> splittedMap = new LinkedHashMap<>();
//        for (int i = 0; i < s.length(); i = i+lengthOfWord) {
//            splittedMap.put(i, s.substring(i, i+lengthOfWord));
//        }
//
//        List<Integer> result = new ArrayList<>();
//        Set<Map.Entry<Integer, String>> entries = splittedMap.entrySet();
//
//        int counter = 0;
//        String[] copyOfWords = words.clone();
//        for(Map.Entry<Integer, String> entry : entries){
//
//            for (int j = 0; j < copyOfWords.length; j++) {
//                if(copyOfWords[j].equals(entry.getValue())){
//                    if(counter == 0) {
//                        result.add(entry.getKey());
//                    }
//                    copyOfWords[j] = "";
//                    counter++;
//                }
//            }
//
//            if(counter == words.length){
//                copyOfWords = words.clone();
//                counter = 0;
//            }
//
//        }
//
//        return result;
//    }
}

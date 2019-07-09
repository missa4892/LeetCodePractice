import java.util.HashSet;
import java.util.Set;

public class PermutationString {

    public static void main(String[] args) {
        Set<String> result= getPermutations("aeiou");
        result.forEach(System.out::println);
    }

    private static Set<String> getPermutations(String str) {
        if(str == null) return null;

        Set<String> permutations = new HashSet<>();
        if(str.length() == 0){
            permutations.add("");
            return permutations;
        }

        char first = str.charAt(0);
        String remainder = str.substring(1);
        Set<String> words = getPermutations(remainder);
        for (String word : words){
            for (int j = 0; j <= word.length(); j++) {
                String s = insertCharAt(word, first, j);
                permutations.add(s);
            }
        }

        return permutations;
    }

    private static String insertCharAt(String word, char c, int i) {
        String start = word.substring(0, i);
        String end = word.substring(i);
        return start + c + end;
    }


}


import java.util.ArrayList;
import java.util.List;

public class KMPPatternSearch {

    public static List<Integer> grep(String haystack, String needle) {

        int[] tempArr = computePiTable(needle);

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < haystack.length()) {
            if(haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if(j == needle.length()) {
                result.add((i - j));
                j = tempArr[j - 1];
            } else if (i < haystack.length() && haystack.charAt(i) != needle.charAt(j)) {
                if (j != 0)
                    j = tempArr[j - 1];
                else {
                    i++;
                }
            }

        }

        return result;

    }

    private static int[] computePiTable(String needle) {
        int[] tempArr = new int[needle.length()];
        int lengthOfPreviousLongestPrefix = 0;
        tempArr[0] = 0;
        int i = 1;

        while(i < needle.length()) {
            if(needle.charAt(i) == needle.charAt(lengthOfPreviousLongestPrefix)) {
                lengthOfPreviousLongestPrefix++;
                tempArr[i] = lengthOfPreviousLongestPrefix;
                i++;
            } else {
                if(lengthOfPreviousLongestPrefix != 0) {
                    lengthOfPreviousLongestPrefix = tempArr[lengthOfPreviousLongestPrefix - 1];
                } else {
                    tempArr[i] = lengthOfPreviousLongestPrefix;
                    i++;
                }
            }
        }
        return tempArr;
    }

}

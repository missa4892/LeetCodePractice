import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {
    public static void main(String[] args) {
//        System.out.println(hasThreeConsecutive("9088897541"));
//        System.out.println(hasFourTimes("9088897541"));
        String[][] input = new String[3][3];
        input[0] = new String[]{"Yes", "Yes", "No"};
        input[1] = new String[]{"No", "Yes", "No"};
        input[2] = new String[]{"Yes", "Yes", "Yes"};
        richestPersonInRoom(input);

    }

    private static int richestPersonInRoom(String[][] input) {

        int maxNotSeen = 0;
        int potentialRichestPersonIndex = -1;
        for (int i = 0; i < input.length; i++) {
            int currMax = 0;
            for (int j = 0; j < input[i].length; j++) {
                if (i != j) {
                    if ("No".equals(input[i][j])) {
                        currMax++;
                        if (currMax >= maxNotSeen) {
                            maxNotSeen = currMax;
                            potentialRichestPersonIndex = i;
                        }
                    } else {
                        currMax = 0;
                    }
                }

            }
        }
        return potentialRichestPersonIndex;
    }

    private static boolean hasFourTimes(String str) {
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int currCount = 0;
            currCount = countMap.getOrDefault(str.charAt(i), 0);
            countMap.put(str.charAt(i), currCount + 1);
        }

        for (Map.Entry mapElement : countMap.entrySet()) {
            if ((int)mapElement.getValue() >= 4) return true;
        }

        return false;
    }


    private static boolean hasThreeConsecutive(String str) {

        int maxSoFar = 0;
        int currMax = 0;
        char prevChar = 'a';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == prevChar) {
                currMax++;
                maxSoFar = Math.max(maxSoFar + 1, currMax);
            } else {
                currMax = 0;
            }

            if (maxSoFar == 2) {
                return true;
            }

            prevChar = str.charAt(i);
        }
        return false;
    }
}

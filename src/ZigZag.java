import java.util.ArrayList;
import java.util.List;

public class ZigZag {

    private static final String POSITIVE = "positive";
    private static final String NEGATIVE = "negative";


    public static void main(String[] args){

        int[] sequence = {1,7,5, 2, 9, 10, 1};
        List<Integer> subsequence = getZigZagSubSequence(sequence);

        subsequence.forEach(System.out::println);
    }

    private static List<Integer> getZigZagSubSequence(int[] sequence) {

        List<Integer> subsequence = new ArrayList<>();

        int currentIndex = 0;

        String expectingNextInSequence = POSITIVE;
        int difference = sequence[currentIndex] - sequence[currentIndex + 1];
        if(difference > 0){
            expectingNextInSequence = NEGATIVE;
        }
        subsequence.add(difference);
        currentIndex = 1;
        int nextIndex = currentIndex + 1;

        for (int i = 1; i < sequence.length - 1; i++) {
            difference = sequence[currentIndex] - sequence[nextIndex];
            if (isPositiveDifference(expectingNextInSequence, difference) || isNegativeDifference(expectingNextInSequence, difference)){
                subsequence.add(difference);
                currentIndex = i + 1;
                nextIndex = currentIndex + 1;
                expectingNextInSequence = difference > 0 ? NEGATIVE : POSITIVE;
            } else {
                nextIndex++;
            }

        }

        return subsequence;
    }

    private static boolean isNegativeDifference(String expectingNextInSequence, int difference) {
        return difference < 0 && expectingNextInSequence.equalsIgnoreCase(NEGATIVE);
    }

    private static boolean isPositiveDifference(String expectingNextInSequence, int difference) {
        return difference >= 0 && expectingNextInSequence.equalsIgnoreCase(POSITIVE);
    }
}

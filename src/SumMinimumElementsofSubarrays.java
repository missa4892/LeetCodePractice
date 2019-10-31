import java.util.Stack;

public class SumMinimumElementsofSubarrays {

    static class Pair {
        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    /*
        [3, 1, 2, 4]
         |
    left[1, 2, 1, 1]
   right[1, 3, 2, 1]
   sum   1*3 + 6*1 + 2*2 + 1*4 = 17
    */
    public static int sumSubarrayMins(int[] A) {

        int[] left = subArraysWithMinAtIndexLeft(A);
        int[] right = subArraysWithMinAtIndexRight(A);

        int result = 0;

        for (int i = 0; i < A.length; i++) {
            result = result + A[i] * left[i] * right[i];
        }

        return result;
    }

    private static int[] subArraysWithMinAtIndexRight(int[] A) {
        Stack<Pair> s2 = new Stack<>();
        int[] right = new int[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            int count = 1;

            while (!s2.isEmpty() && s2.peek().key >= A[i]) {
                count += s2.peek().value;
                s2.pop();
            }
            s2.push(new Pair(A[i], count));
            right[i] = count;
        }
        return right;
    }

    private static int[] subArraysWithMinAtIndexLeft(int[] A) {
        Stack<Pair> s1 = new Stack<>();
        int[] left = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int count = 1;

            while (!s1.isEmpty() && s1.peek().key > A[i]) {
                count += s1.peek().value;
                s1.pop();
            }
            s1.push(new Pair(A[i], count));
            left[i] = count;
        }
        return left;
    }
}

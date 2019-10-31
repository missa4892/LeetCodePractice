import java.util.Stack;

public class SumSubarrayMinimums {

    /*
    Explanation: Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4].
    Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.  Sum is 17.
     */
    public static int sumSubarrayMins(int[] A) {

        int n = A.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (stack.size() != 0 && A[stack.peek()] >= A[i]){
                left[i] += left[stack.peek()] + 1;
                stack.pop();
            }
            stack.push(i);
        }

        while (stack.size() != 0)
            stack.pop();

        for (int i = n - 1; i >= 0; i--) {
            while (stack.size() != 0 && A[stack.peek()] > A[i]){
                right[i] += right[stack.peek()] + 1;
                stack.pop();
            }
            stack.push(i);
        }

        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result += (left[i] + 1) * (right[i] + 1) * A[i];
        }

        return result;
    }
}

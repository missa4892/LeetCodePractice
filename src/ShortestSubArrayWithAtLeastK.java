import java.util.ArrayDeque;
import java.util.Deque;

public class ShortestSubArrayWithAtLeastK {

    public static int shortestSubarray(int[] A, int K) {
        int N = A.length, res = N + 1;
        int[] B = new int[N + 1];
        for (int i = 0; i < N; i++) {
            B[i + 1] = B[i] + A[i];
        }
        Deque<Integer> d = new ArrayDeque<>();
        for (int i = 0; i < N + 1; i++) {
            while (d.size() > 0 && B[i] - B[d.getFirst()] >=  K)
                res = Math.min(res, i - d.pollFirst());
            while (d.size() > 0 && B[i] <= B[d.getLast()]) {
                d.pollLast();
            }
            d.addLast(i);
        }
        return res <= N ? res : -1;
    }

//    public static int shortestSubarray(int[] A, int K) {
//        int start = 0;
//        int end = 0;
//
//        int currSum = 0;
//        int minSoFar = Integer.MAX_VALUE;
//
//        while (end < A.length) {
//            while (currSum <= K && end < A.length) {
//                if (currSum <= 0 && K > 0) {
//                    start = end;
//                    currSum = 0;
//                }
//
//                currSum += A[end++];
//            }
//
//            while (currSum > K && start <= A.length) {
//                minSoFar = Math.min(minSoFar, end - start);
//
//                currSum -= A[start++];
//            }
//        }
//
//        if (currSum >= K) {
//            minSoFar = Math.min(minSoFar, end - start);
//        }
//
//        return minSoFar == Integer.MAX_VALUE ? -1 : minSoFar;
//    }
}

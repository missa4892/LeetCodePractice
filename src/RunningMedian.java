import java.util.PriorityQueue;

public class RunningMedian {

    public static double[] runningMedian(int[] intStream) {

        int length = intStream.length;
        double[] result = new double[length];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < length; i++) {
            addToQueue(minHeap, maxHeap, intStream[i]);
            rebalanceQueues(minHeap, maxHeap);
            result[i] = calculateMedian(minHeap, maxHeap);
        }
        return result;
    }

    private static double calculateMedian(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        PriorityQueue<Integer> smaller = minHeap.size() < maxHeap.size() ? minHeap : maxHeap;
        PriorityQueue<Integer> higher = minHeap.size() < maxHeap.size() ? maxHeap : minHeap;

        if (smaller.size() == higher.size()) {
            return (double) ((smaller.peek() + higher.peek()) / 2);
        } else {
            return higher.peek();
        }
    }

    private static void rebalanceQueues(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        PriorityQueue<Integer> smaller = minHeap.size() < maxHeap.size() ? minHeap : maxHeap;
        PriorityQueue<Integer> higher = minHeap.size() > maxHeap.size() ? minHeap : maxHeap;

        if (higher.size() - smaller.size() >= 2) {
            smaller.add(higher.poll());
        }
    }

    private static void addToQueue(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap, int currNum) {
        if (maxHeap.isEmpty() || maxHeap.peek() > currNum) {
            maxHeap.add(currNum);
        } else {
            minHeap.add(currNum);
        }
    }
}

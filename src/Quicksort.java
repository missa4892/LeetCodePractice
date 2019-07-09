import java.util.Arrays;
import java.util.List;

public class Quicksort {

    public static void main(String[] args) {

        List<Integer> sequence = Arrays.asList(7, 8, 34, 5, 7, 90);

        int high = sequence.size() - 1;
        int low = 0;

        List<Integer> sortedList = quickSort(sequence, low, high);

        sortedList.forEach(System.out::println);
    }

    private static List<Integer> quickSort(List<Integer> sequence, int low, int high) {

        if(low < high){
            int partitionIndex = partition(sequence, low, high);

            quickSort(sequence, low, partitionIndex - 1);
            quickSort(sequence, partitionIndex + 1, high);
        }

        return sequence;
    }

    private static int partition(List<Integer> sequence, int low, int high) {

        int pivot = sequence.get(high);

        int lowIndex = low - 1;

        for (int j = low; j <= high - 1; j++){

            if(sequence.get(j) <= pivot){
                lowIndex++;
                swap(sequence, lowIndex, j);
            }
        }
        swap(sequence, lowIndex + 1, high);
        return lowIndex + 1;
    }

    private static void swap(List<Integer> sequence, Integer firstIndex, Integer secondIndex) {
        int firstVal = sequence.get(firstIndex);
        int secondVal = sequence.get(secondIndex);

        sequence.set(firstIndex, secondVal);
        sequence.set(secondIndex, firstVal);

    }
}

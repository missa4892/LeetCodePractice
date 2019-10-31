import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IsMinHeap {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> inputList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String[] inputArr = inputStr.trim().split(" ");
        for(String item : inputArr){
            int number = Integer.parseInt(item);
            inputList.add(number);
        }

        System.out.println(isMinHeap(inputList));
    }

    private static boolean isMinHeap(List<Integer> inputList) {
        if(inputList == null || inputList.size() == 0){
            return false;
        }

        for(int i = 0; i < inputList.size(); i++){
            int number = inputList.get(i);
            int leftChildIndex = 2 * i + 1;
            if(leftChildIndex < inputList.size()){
                int leftChild = inputList.get(leftChildIndex);
                if(leftChild < number) {
                    return false;
                }
            }
            int rightChildIndex = 2 * i + 2;
            if(rightChildIndex < inputList.size()){
                int rightChild = inputList.get(rightChildIndex);
                if(rightChild < number) {
                    return false;
                }
            }
        }
        return true;
    }
}

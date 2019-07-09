import java.util.Arrays;

public class ReverseArrayInplace {

    public static void main(String[] args){

        int sampleInput[] = {1, 2, 3, 4, 5, 6, 7};


        System.out.println(Arrays.toString(reverse(sampleInput)));


    }

    private static int[] reverse(int[] sampleInput) {

        for (int i = 0; i < sampleInput.length / 2; i++) {
            if(i != sampleInput.length - 1 - i){
                int temp = sampleInput[i];
                sampleInput[i] = sampleInput[sampleInput.length - 1 - i];
                sampleInput[sampleInput.length - 1 - i] = temp;
            }
        }
        return sampleInput;
    }
}

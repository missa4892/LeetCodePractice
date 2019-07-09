public class MergeSortedArrays {

    public static void main(String[] args) {

        int a[] = new int []{1, 2, 3, 4, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        int b[] = new int []{-1, 2, 7, 9};

        int[] result = mergeArrays(a, b, 4, 4);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }



    }

    private static int[] mergeArrays(int[] a, int[] b, int lastOfA, int lastOfB) {
       int indexA = lastOfA - 1;
       int indexB = lastOfB - 1;

       int indexMerge = a.length - 1;

       while(indexB >= 0){
           if(indexA >= 0 && a[indexA] > b[indexB]){
               a[indexMerge] = a[indexA];
               indexA--;
           } else {
               a[indexMerge] = b[indexB];
               indexB--;
           }
           indexMerge--;
       }

        return a;
    }
}

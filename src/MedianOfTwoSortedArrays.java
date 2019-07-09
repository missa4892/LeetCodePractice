public class MedianOfTwoSortedArrays {
    public static void main(String[] args){

        int[] nums1 = {1};
        int[] nums2 = {1,1,1};

        System.out.println(median(nums1, nums2));
    }

    private static double median(int[] nums1, int[] nums2) {

        int lengthOfNums1 = nums1.length;
        int lengthOfNums2 = nums2.length;

        int medianPosition1 = -1;
        int medianPosition2 = -1;
        medianPosition1 = (lengthOfNums1 + lengthOfNums2) / 2;
        if (isEvenSumLength(lengthOfNums1, lengthOfNums2)){
            medianPosition2 = medianPosition1 + 1;
        }

        int ceil = medianPosition1 + 1;
        int[] mergedArray = new int[ceil];
        if(lengthOfNums1 == 0){
            mergedArray = nums1;
        } else if (lengthOfNums2 == 0){
            mergedArray = nums2;
        }
        int itemsMergedTillNow = 0;
        int i = 0;
        int j = 0;
        while (itemsMergedTillNow < ceil && i < lengthOfNums1 && j < lengthOfNums2) {
            if (nums1[i] < nums2[j]){
                mergedArray[itemsMergedTillNow] = nums1[i];
            } else {
                mergedArray[itemsMergedTillNow] = nums2[j];
            }
        }

        return 1.0;
    }

    private static boolean isEvenSumLength(int x, int y) {
        return (x + y) % 2 == 0;
    }

    /*
    [1, 2, 3]
    [1, 3, 5]
    [1, 1, 2, 3, 3

    1, 2, 3, 3, 4, 4 => (3+3)/2.0 = 3.0
    1,2,3
     */



//    private static double median(int[] nums1, int[] nums2) {
//        int m = nums1.length;
//        int n = nums2.length;
//
//        double medianIndex = Math.round((m+n)+1) / 2.0;
//
//
//        int[] mergedArray = new int[(int) Math.ceil(medianIndex)];
//        if(m == 0){
//            mergedArray = nums2;
//        } else if (n == 0){
//            mergedArray = nums1;
//        }
//        int itemsMergedTillNow = 0;
//        int i = 0;
//        int j = 0;
//        while(itemsMergedTillNow <= Math.ceil(medianIndex) && i < nums1.length && j < nums2.length){
//            if(nums1[i] > nums2[j]){
//                mergedArray[itemsMergedTillNow] = nums2[j];
//                j++;
//            } else if(nums1[i] < nums2[j]){
//                mergedArray[itemsMergedTillNow] = nums1[i];
//                i++;
//            } else {
//                //both equal
//                mergedArray[itemsMergedTillNow] = nums1[i];
//                itemsMergedTillNow++;
//                mergedArray[itemsMergedTillNow] = nums2[j];
//                i++;
//                j++;
//            }
//            itemsMergedTillNow++;
//        }
//
//        if(medianIndex % 1 == 0){
//            if(mergedArray.length >= 1){
//                return (double) mergedArray[(int) medianIndex - 1];
//            }
//            return (double) mergedArray[(int) medianIndex];
//        } else {
//            int first = (int) medianIndex - 1;
//            int second = (int) Math.ceil(medianIndex - 1);
//            return Math.round((mergedArray[first] + mergedArray[second])) / 2.0;
//        }
//    }
}

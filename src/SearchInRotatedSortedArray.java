public class SearchInRotatedSortedArray {
    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 8, 0, 1, 2};
        int target = 0;

        int startIndex = 0;
        int endIndex = nums.length - 1;

        System.out.println(searchInArray(nums, startIndex, endIndex, target));
    }

    /*
        nums = 4,5,6,7,8,0,1,2

        nums = 7 8 0 1 2 4 5 6
     */
    private static int searchInArray(int[] nums, int startIndex, int endIndex, int target) {

        if (startIndex > endIndex) {
            return -1;
        }

        int halfIndex = (endIndex + startIndex) / 2;

        if (target == nums[halfIndex]) {
            return halfIndex;
        }

        if (nums[startIndex] <= nums[halfIndex]) {
            if (target >= nums[startIndex] && target <= nums[halfIndex]) {
                endIndex = halfIndex - 1;
                return searchInArray(nums, startIndex, endIndex, target);
            }
            startIndex = halfIndex + 1;
            return searchInArray(nums, startIndex, endIndex, target);
        }

        if (target >= nums[halfIndex] && target <= nums[endIndex]) {
            startIndex = halfIndex + 1;
            return searchInArray(nums, startIndex, endIndex, target);
        }
        endIndex = halfIndex - 1;
        return searchInArray(nums, startIndex, endIndex, target);

    }

}

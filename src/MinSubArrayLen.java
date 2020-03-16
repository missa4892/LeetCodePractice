public class MinSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {
        int minCount = Integer.MAX_VALUE;

        int startIndex = 0;
        int endIndex = 0;

        int sumSoFar = nums[startIndex];

        int countTillNow = 1;

        while (startIndex <= endIndex) {

            if(sumSoFar >= target) {
                minCount = Math.min(minCount, countTillNow);
            }

            if(sumSoFar <= target) {
                if (endIndex + 1 < nums.length) {
                    endIndex++;
                    sumSoFar += nums[endIndex];
                    countTillNow++;
                } else {
                    sumSoFar -= nums[startIndex++];
                    countTillNow--;
                }

            } else {
                sumSoFar -= nums[startIndex++];
                countTillNow--;
            }


        }
        return minCount > nums.length ? 0 : minCount;
    }
}

import java.util.TreeSet;

public class Pattern132 {

    public boolean find132pattern(int[] nums) {
        int[] leftMin = nums.clone();
        for (int i = 1; i < leftMin.length; i++) {
            leftMin[i] = Math.min(leftMin[i-1], leftMin[i]);
        }

        TreeSet<Integer> bst = new TreeSet<>();
        for (int i = nums.length - 1; i > 0; i--) {
            int num = nums[i];
            if (bst.lower(num) != null) {
                int right = bst.lower(num);
                int left = leftMin[i-1];
                if (left < right && left < num) {
                    return true;
                }
            }
            bst.add(num);
        }
        return false;
    }
}

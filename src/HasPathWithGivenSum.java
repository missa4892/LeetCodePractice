public class HasPathWithGivenSum {

    public boolean hasPath(Node node, int targetSum) {

        boolean ans = false;

        int subSum = targetSum - node.data;

        if (subSum == 0 && node.left == null && node.right == null) {
           return true;
        }
        if (node.left != null) {
             ans = hasPath(node.left, subSum);
        }
        if (node.right != null) {
            if (!ans) {
             ans = hasPath(node.right, subSum);
            }
        }
        return ans;
    }



}

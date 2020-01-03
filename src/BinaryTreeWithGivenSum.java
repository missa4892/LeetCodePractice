public class BinaryTreeWithGivenSum {
    private int count = 0;

    public int countPaths(Node node, int targetSum) {

        int subSum = targetSum - node.data;
        countPathsFromNode(node.left, subSum);
        countPathsFromNode(node.right, subSum);
        return count;
    }

    private void countPathsFromNode(Node node, int targetSum) {
        int subSum = targetSum - node.data;

        if (subSum == 0 && node.left == null && node.right == null) {
            count++;
        } else {
            if (node.left != null) {
                countPathsFromNode(node.left, subSum);
            }
            if (node.right != null) {
                countPathsFromNode(node.right, subSum);
            }
        }
    }

    public int countPathsWithSum(Node node, int targeSum) {
        if (node == null) return 0;

        int pathsFromRoot = countPathsWithSumFromNode(node, targeSum, 0);

        int pathsOnLeft = countPathsWithSum(node.left, targeSum);
        int pathsOnRight = countPathsWithSum(node.right, targeSum);

        return pathsFromRoot + pathsOnLeft + pathsOnRight;
//        return pathsFromRoot;
    }

    private static int countPathsWithSumFromNode(Node node, int targeSum, int currentSum) {
        if (node == null) return 0;

        currentSum += node.data;

        int totalPaths = 0;
        if (currentSum == targeSum){
            return totalPaths++;
        }

        totalPaths += countPathsWithSumFromNode(node.left, targeSum, currentSum);
        totalPaths += countPathsWithSumFromNode(node.right, targeSum, currentSum);

        return totalPaths;
    }
}

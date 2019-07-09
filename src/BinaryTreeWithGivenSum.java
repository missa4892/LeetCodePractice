public class BinaryTreeWithGivenSum {

    public static void main(String[] args){
        Node a = new Node();
        a.setValue(5);

        Node b = new Node();
        b.setValue(3);

        Node c = new Node();
        c.setValue(7);

        Node d = new Node();
        d.setValue(2);

        Node e = new Node();
        e.setValue(4);

        Node f = new Node();
        f.setValue(6);

        Node g = new Node();
        g.setValue(8);

        a.setLeft(b);
        a.setRight(c);

        b.setLeft(d);
        b.setRight(e);

        c.setLeft(f);
        c.setRight(g);

        System.out.println(countPathsWithSum(a, 12));
    }

    private static int countPathsWithSum(Node node, int targeSum) {
        if (node == null) return 0;

        int pathsFromRoot = countPathsWithSumFromNode(node, targeSum, 0);

        int pathsOnLeft = countPathsWithSum(node.getLeft(), targeSum);
        int pathsOnRight = countPathsWithSum(node.getRight(), targeSum);

        return pathsFromRoot + pathsOnLeft + pathsOnRight;
//        return pathsFromRoot;
    }

    private static int countPathsWithSumFromNode(Node node, int targeSum, int currentSum) {
        if (node == null) return 0;

        currentSum += node.getValue();

        int totalPaths = 0;
        if (currentSum == targeSum){
            return totalPaths++;
        }

        totalPaths += countPathsWithSumFromNode(node.getLeft(), targeSum, currentSum);
        totalPaths += countPathsWithSumFromNode(node.getRight(), targeSum, currentSum);

        return totalPaths;
    }

    private static class Node {
        private int value;
        private Node right;
        private Node left;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }
    }
}

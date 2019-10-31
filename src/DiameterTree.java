public class DiameterTree {

    public static int diameter(Node node){
        if(node == null) return 0;

        int heightOfLeftTree = height(node.left);
        int heightOfRightTree = height(node.right);

        int maxHeightViaRoot = heightOfLeftTree + 1 + heightOfRightTree;

        int diameterLeft = diameter(node.left);
        int diameterRight = diameter(node.right);

        return Math.max(maxHeightViaRoot, Math.max(diameterLeft, diameterRight));
    }

    private static int height(Node node) {
        if (node == null) return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}

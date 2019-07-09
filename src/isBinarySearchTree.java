public class isBinarySearchTree {

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

        Node nuke = new Node();
        nuke.setValue(5);

        a.setLeft(b);
        a.setRight(c);

        b.setLeft(d);
        b.setRight(e);

        c.setLeft(f);
        c.setRight(nuke);

        System.out.println(isBST(a));
    }

    private static boolean isBST(Node node) {
        return isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBST(Node node, int minVal, int maxVal) {
        if(node == null){
            return true;
        }

        int value = node.getValue();

        if((minVal > value) || (maxVal < value)){
            return false;
        }

        Node leftNode = node.getLeft();
        Node rightNode = node.getRight();

        return isBST(leftNode, minVal, value) && isBST(rightNode, value + 1, maxVal);
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

import java.util.Scanner;

class HeightOfTree {

    public int longestPath(Node root) {
        int heightOfLeftBranch = heightOfTree(root.left);
        int heightOfRightBranch = heightOfTree(root.right);
        return heightOfLeftBranch + heightOfRightBranch + 1;
    }

    public int heightOfTree(Node node) {
        if(node == null) {
            return 1;
        }
        return Math.max(heightOfTree(node.left), heightOfTree(node.right)) + 1;
    }

    public static int height(Node root) {
        // Write your code here.
        int count = 0;
        if(root != null) count = 0;
        heightHelper(count, root);
        return count;

    }

    public static void heightHelper(int count, Node root){
        if(root == null) return;
        while(hasChildren(root)){
            count++;
            heightHelper(count, root.left);
            heightHelper(count, root.right);
        }
    }

    public static boolean hasChildren(Node root){
        return root.left != null || root.right != null;
    }
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }
}

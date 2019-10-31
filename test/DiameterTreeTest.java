import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiameterTreeTest {

    @Test
    public void test1() {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

        int diameter = DiameterTree.diameter(node);
        assertEquals(4, diameter);

    }

    @Test
    public void test2() {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.right.right = new Node(7);
        node.right.left = new Node(6);
        node.right.left.left = new Node(8);
        node.right.left.right = new Node(9);
        node.right.left.left.left = new Node(12);
        node.right.left.left.right = new Node(10);
        node.right.left.left.right.right = new Node(11);

        int diameter = DiameterTree.diameter(node);
        assertEquals(8, diameter);

    }

    @Test
    public void test3() {
        Node node = new Node(1);
        node.right = new Node(3);
        node.right.right = new Node(7);
        node.right.left = new Node(6);
        node.right.left.left = new Node(8);
        node.right.left.right = new Node(9);
        node.right.left.left.left = new Node(12);
        node.right.left.left.right = new Node(10);
        node.right.left.left.right.right = new Node(11);

        int diameter = DiameterTree.diameter(node);
        assertEquals(6, diameter);

    }

}
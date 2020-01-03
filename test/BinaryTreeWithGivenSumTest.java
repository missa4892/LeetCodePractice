import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeWithGivenSumTest {

    Node a;
    BinaryTreeWithGivenSum binaryTreeWithGivenSum = new BinaryTreeWithGivenSum();

    @BeforeEach
    void setUp() {
        a = new Node(5);

        Node b = new Node(3);

        Node c = new Node(7);

        Node d = new Node(2);

        Node e = new Node(4);

        Node f = new Node(6);

        Node g = new Node(8);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

    }

    @Test
    void test1() {
        assertEquals(1, binaryTreeWithGivenSum.countPaths(a, 12));
    }

    @Test
    void test2() {
        a = new Node(10);

        Node b = new Node(5);
        Node c = new Node(-3);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(11);
        Node g = new Node(3);
        Node h = new Node(-2);
        Node i = new Node(1);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = null;

        d.left = g;
        d.right = h;

        e.right = i;

        assertEquals(3, binaryTreeWithGivenSum.countPaths(a, 8));
    }
}


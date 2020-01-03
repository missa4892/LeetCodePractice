import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasPathWithGivenSumTest {

    Node a;
    HasPathWithGivenSum hasPathWithGivenSum;

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

        hasPathWithGivenSum = new HasPathWithGivenSum();
    }

    @Test
    void test1() {
        assertTrue(hasPathWithGivenSum.hasPath(a, 12));
    }

    @Test
    void test2() {
        assertTrue(hasPathWithGivenSum.hasPath(a, 18));
    }

    @Test
    void test3() {
        assertTrue(hasPathWithGivenSum.hasPath(a, 10));
    }
}
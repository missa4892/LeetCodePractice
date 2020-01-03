import org.junit.jupiter.api.Test;

class SumTwoLinkedListTest {

    @Test
    void test1() {
        LinkedNode first = new LinkedNode(7  );
        first.next = new LinkedNode(5);
        first.next.next = new LinkedNode(9);
        first.next.next.next = new LinkedNode(4);
        first.next.next.next.next = new LinkedNode(6);

        LinkedNode second = new LinkedNode(8);
        second.next = new LinkedNode(4);

        System.out.println(SumTwoLinkedList.reverseSum(first, second));
    }

}
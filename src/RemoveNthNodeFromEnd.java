import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEnd {

    public static void main(String[] args){

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;

        ListNode result = removeNthNodeFromEnd(a, 2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }


    }

    private static ListNode removeNthNodeFromEnd(ListNode head, int n) {

        ListNode current = head;

        List<Integer> nodeList = new ArrayList<>();
        while(current != null){
            nodeList.add(current.val);
            current = current.next;
        }

        int totalSize = nodeList.size();

        int indexToRemove = totalSize - n;

        if(indexToRemove == 0){
            return head.next;
        }

        current = head;
        int counter = 0;
        while(current != null){
            if(counter == indexToRemove){
                ListNode temp = current.next;
                ListNode next = temp.next;
                current.next = next;
                return head;
            }
            current = current.next;
            counter++;
        }

        return head;
    }

    private static class ListNode{
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}

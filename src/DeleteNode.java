public class DeleteNode {

    public static void main(String[] args) {

       MyNode node1 = new MyNode(1);
       MyNode node2 = new MyNode(2);
       MyNode node3 = new MyNode(3);
       MyNode node4 = new MyNode(4);

       node1.next = node2;
       node2.next = node3;
       node3.next = node4;
       node4.next = null;

       deleteNode(node2);

        System.out.println(node1);
    }

    private static void deleteNode(MyNode myNode) {
        myNode = new MyNode(77);
    }

    private static class MyNode {
        int val;
        MyNode next;

        public MyNode(int val) {
            this.val = val;
        }
    }
}
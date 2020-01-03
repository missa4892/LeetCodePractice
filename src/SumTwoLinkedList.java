public class SumTwoLinkedList {

    public static LinkedNode reverseSum(LinkedNode first, LinkedNode second) {

        LinkedNode currFirstNode = first;
        LinkedNode currSecondNode = second;

        LinkedNode headResult = null;
        LinkedNode result = null;

        int carryOver = 0;

        while (currFirstNode != null && currSecondNode != null) {
            int currSum = currFirstNode.data + currSecondNode.data + carryOver;

            if (currSum >= 10) {
                carryOver = 1;
            } else {
                carryOver = 0;
            }

            int newData = currSum % 10;

            if (result == null) {
                result = new LinkedNode(newData);
                headResult = result;
            } else {
                result.next = new LinkedNode(newData);
                result = result.next;
            }

            currFirstNode = currFirstNode.next;
            currSecondNode = currSecondNode.next;
        }

        LinkedNode longerNode = null;
        if (currFirstNode != null) {
            longerNode = currFirstNode;
        } else if (currSecondNode != null) {
            longerNode = currSecondNode;
        }

        while (longerNode != null) {
            int newData = carryOver + longerNode.data;
            if (newData >= 10) {
                carryOver = 1;
                newData = newData % 10;
            } else {
                carryOver = 0;
            }
            result.next = new LinkedNode(newData);
            result = result.next;
            longerNode = longerNode.next;
        }

        return headResult;

    }
}

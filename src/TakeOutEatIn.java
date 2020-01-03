public class TakeOutEatIn {

    /*
        Take Out Orders: [1, 3, 5]
                             |
         Dine In Orders: [2, 4, 6]
                             |
          Served Orders: [1, 2, 4, 6, 5, 3]
                                |
     */

    public boolean isFirstComeFirstServed(int[] takeOut, int[] dineIn, int[] servedOrder) {
        int i = 0;
        int j = 0;
        int k = 0;

        boolean isAllGood = false;
        while(i < takeOut.length && j < dineIn.length && k < servedOrder.length) {
            if(takeOut[i] < dineIn[j]) {
                if(servedOrder[k] == takeOut[i]) {
                    isAllGood = true;
                    i++;
                    k++;
                } else {
                    return false;
                }
            } else if(dineIn[j] < takeOut[i]) {
                if(servedOrder[k] == dineIn[j]) {
                    isAllGood = true;
                    j++;
                    k++;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}

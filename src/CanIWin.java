import java.util.HashMap;

public class CanIWin {

    public static boolean canIWin(int maxChooseableInt, int desiredTotal) {

            if (maxChooseableInt >= desiredTotal) return true;

            int sum = maxChooseableInt * (maxChooseableInt + 1) / 2;
            if(sum  < desiredTotal) {
                return false;
            }

            HashMap<Integer, Boolean> memo = new HashMap<>();
            return canWin(maxChooseableInt, desiredTotal, 0, memo);

        }

        private static boolean canWin(int maxChooseableInt, int desiredTotal, int used, HashMap<Integer, Boolean> memo) {
            if(memo.containsKey(used)) {
                return memo.get(used);
            }

            for (int i = 0; i < maxChooseableInt; i++) {
                int curr = (1 << i);
                //check if ith bit is not used
                if ((curr & used) == 0) {
                    //curr | used ==> sets ith bit to 1, meaning it is chosen
                    if(desiredTotal <= i + 1 || !canWin(maxChooseableInt, desiredTotal - (i + 1), curr | used, memo)){
                        memo.put(used, true);
                        return true;
                    }
                }
            }
            memo.put(used, false);
            return false;
        }
    }
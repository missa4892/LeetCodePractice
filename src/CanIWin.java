import java.util.HashMap;

public class CanIWin {

    public static boolean canIWin(int maxChooseableInt, int desiredTotal) {

        if (maxChooseableInt >= desiredTotal) return true;

        int sum = maxChooseableInt * (maxChooseableInt + 1) / 2;
        if(sum  < desiredTotal) {
            return false;
        }

        HashMap<Integer, Boolean> memo = new HashMap<>();
        return canPlayerWin(maxChooseableInt, desiredTotal, 0, memo);

    }

    private static boolean canPlayerWin(int maxChooseableInt, int desiredTotal, int chosenState, HashMap<Integer, Boolean> memo) {
        if(memo.containsKey(chosenState)) {
            return memo.get(chosenState);
        }

        for (int i = 0; i < maxChooseableInt; i++) {
            int curr = (1 << i);
            boolean isCurrChosen = (curr & chosenState) != 0;
            if (!isCurrChosen) {
                int newChosenState = curr | chosenState;
                if(desiredTotal <= i + 1 || !canPlayerWin(maxChooseableInt, desiredTotal - (i + 1), newChosenState, memo)){
                    memo.put(chosenState, true);
                    return true;
                }
            }
        }
        memo.put(chosenState, false);
        return false;
    }
}
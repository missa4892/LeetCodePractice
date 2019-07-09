import java.util.Arrays;

public class Fibonnaci {

    public int fib(int n){

        int [] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        return dp(memo, n);
    }

    private int dp(int[] memo, int n){
        if(n == 1 || n == 2){
            return 1;
        }
        if(memo[n] != -1){
            return memo[n];
        } else {
            memo[n] = fib(n-1) + fib(n-2);
        }
        return memo[n];
    }

    public long bottom_up_dp(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        long [] bottom_up = new long[n + 1];
        bottom_up[1] = 1;
        bottom_up[2] = 1;

        for (int i = 3; i <= n; i++) {
            bottom_up[i] = bottom_up[i - 1] + bottom_up[i - 2];
        }
        return bottom_up[n];
    }
}

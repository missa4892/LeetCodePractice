public class PalindromePartitioning {

    public static int minPalindromePartitioning(String s) {

        int n = s.length();

        boolean p[][] = new boolean[n][n];
        int[] minCuts = new int[n];

        for(int i = 0; i < n; i++) {
            p[i][i] = true;
        }

        for(int i = 2; i <= n; i++) {
            for(int startIndex = 0; startIndex < n - i + 1; startIndex++) {
                int endIndex = startIndex + i - 1;

                if (i == 2) {
                    p[startIndex][endIndex] = s.charAt(startIndex) == s.charAt(endIndex);
                } else {
                    p[startIndex][endIndex] = s.charAt(startIndex) == s.charAt(endIndex) &&
                            p[startIndex + 1][endIndex - 1];
                }
            }
        }


        for(int i = 0; i < n; i++) {
            if(p[0][i]) {
                minCuts[i] = 0;
            } else {
                minCuts[i] = Integer.MAX_VALUE;
                for(int j = 0; j < i; j++) {
                    if(p[j+1][i] && minCuts[j] + 1 < minCuts[i]) {
                        minCuts[i] = minCuts[j] + 1;
                    }
                }
            }
        }
        return minCuts[n-1];
    }
}

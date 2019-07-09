public class DigPow {

    public static void main(String[] args) {

        System.out.println(digPow(46288, 3));
    }

    private static long digPow(int n, int p) {
        int[] numArr = Integer.toString(n).chars().map(c -> c-'0').toArray();

        int totalSum = 0;
        for (int i = 0; i < numArr.length; i++) {
            totalSum += Math.pow(numArr[i], p);
            p--;
        }

        if(totalSum % n == 0){
            return totalSum / n;
        }

        return -1;
    }
}

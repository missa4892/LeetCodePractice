public class EquilibriumIndex {
    public static void main(String[] args){
        int[] A = {-1, 3, -4, 5, 1, -6, 2, 1};
        System.out.println(equilibriumIndex(A, 8));
    }

    private static int equilibriumIndex(int[] A, int N) {

        int totalSum = 0;
        for (int i = 0; i < A.length; i++) {
            totalSum += A[i];
        }

        int leftSum = 0;
        int rightSum = 0;
        rightSum = totalSum;
        for (int i = 0; i < A.length; i++) {

            rightSum -= A[i];

            if(leftSum == rightSum){
                return A[i];
            }

            leftSum += A[i];
        }

        return -1;
    }

    /*
    P = 1 is an equilibrium index of this array, because:

        A[0] = −1 = A[2] + A[3] + A[4] + A[5] + A[6] + A[7]

P = 3 is an equilibrium index of this array, because:

        A[0] + A[1] + A[2] = −2 = A[4] + A[5] + A[6] + A[7]

P = 7 is also an equilibrium index, because:

        A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] = 0

     */

//    private static int equilibriumIndex(int[] A, int N) {
//
//        int leftSum = 0;
//        int rightSum = 0;
//        for (int i = 1; i < N; i++){
//
//            for(int j = 0; j < i; j++){
//                leftSum += A[j];
//            }
//
//            for(int z = N-1; z > i; z--){
//                rightSum += A[z];
//            }
//
//            if(leftSum == rightSum){
//                return i;
//            }
//
//        }
//
//        return -1;
//    }
}

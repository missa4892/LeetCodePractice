import java.util.Scanner;

public class GardeningRoses {

    private final static int numberOfDifferentRoses = 3;

    public static void main(String [] args) {
        try {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextLine()) {
                int numberOfHouses = scan.nextInt();
                char[][] matrix = new[numberOfHouses][numberOfDifferentRoses];
                for (int i = 0; i < numberOfHouses; i++) {
                    String costsStr = scan.nextLine();
                    costsStr = costsStr.replaceAll(" ", "");
                    char[] costArr = costsStr.toCharArray();
                    matrix[i] = costArr;
                }
                System.out.println(findMinimumCost(matrix));
            }
        } catch (Exception e) {}
    }

    private static int findMinimumCost(char[][] matrix) {

        int previoulyPickedRose = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]
            }
        }

        return 0;
    }
}

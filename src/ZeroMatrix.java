import java.util.Arrays;

public class ZeroMatrix {

    public static void main(String[] args) {

//        int[][] input = new int[3][3];
//
//        input[0][0] = 1;
//        input[0][1] = 1;
//        input[0][2] = 1;
//        input[1][0] = 1;
//        input[1][1] = 0;
//        input[1][2] = 1;
//        input[2][0] = 1;
//        input[2][1] = 1;
//        input[2][2] = 1;

        int[][] input = new int[3][4];

        input[0][0] = 0;
        input[0][1] = 1;
        input[0][2] = 2;
        input[0][3] = 0;
        input[1][0] = 3;
        input[1][1] = 4;
        input[1][2] = 5;
        input[1][3] = 2;
        input[2][0] = 1;
        input[2][1] = 3;
        input[2][2] = 1;
        input[2][3] = 5;

        int[][] output = setZeroes(input);
        System.out.println(Arrays.deepToString(output));

    }

    private static int[][] setZeroes(int[][] input) {

        int n = input.length;
        int m = 0;
        if(n > 0){
            m = input[0].length;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (input[i][j] == 0){
                    input[i][j] = Integer.MIN_VALUE;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (input[i][j] == Integer.MIN_VALUE){
                    fillColumnWithZeroes(i, j, input, m);
                    fillRowWithZeroes(j, i, input, n);
                }
            }
        }

        return input;
    }


    /*
        [[-Num, 1, 2, -Num],         cols: (i,j) -> (i, 0->m)
         [3, 4, 5, 2],               rows: (i,j) -> (0->n, j)
         [1, 3, 1, 5]
         ]
     */
    private static void fillRowWithZeroes(int col, int row, int[][] input, int totalCols) {
        for (int i = 0; i < totalCols; i++) {
            if(i == row || input[i][col] != Integer.MIN_VALUE){
                input[i][col] = 0;
            }
        }
    }

    private static void fillColumnWithZeroes(int row, int col, int[][] input, int totalRows) {
        for (int i = 0; i < totalRows; i++) {
            if(i == col || input[row][i] != Integer.MIN_VALUE){
                input[row][i] = 0;
            }
        }
    }

    /*
    Input:
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output:
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]

     */
}

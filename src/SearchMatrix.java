public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;

        int i = 0;
        int j = matrix[i].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public boolean searchMatrixBinary(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        if (matrix[0].length == 0) return false;
        int endIndex = matrix[0].length - 1;

        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][endIndex]) {
                if (isFoundByBinarySearch(matrix[i], target)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isFoundByBinarySearch(int[] input, int target) {

        int startIndex = 0;
        int endIndex = input.length;
        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2;

            if (input[midIndex] == target) return true;
            else {
                if (input[midIndex] < target) {
                    startIndex = midIndex + 1;
                } else {
                    endIndex = midIndex - 1;
                }
            }
        }
        return false;
    }
}

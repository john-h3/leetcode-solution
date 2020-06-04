package easy.array.toeplitzmatrix;

/**
 * ToeplitzMatrix
 *
 * @author john 2020/6/3
 */
public class ToeplitzMatrix {
    class Solution {
        public boolean isToeplitzMatrix(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            for (int i = 0; i < col; i++) {
                int y = 0;
                int times = Math.min(row, col) - i;
                for (int j = 1; j <= times; j++) {
                    if (matrix[y][i] != matrix[y + j][i + j]) {
                        return false;
                    }
                }
            }
            if (row > 1) {
                for (int i = 1; i < row; i++) {
                    int x = 0;
                    int times = Math.min(row, col) - i;
                    for (int j = 1; j < times; j++) {
                        if (matrix[i][x] != matrix[i + j][x + j]) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}
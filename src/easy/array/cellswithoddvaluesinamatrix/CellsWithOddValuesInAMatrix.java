package easy.array.cellswithoddvaluesinamatrix;

/**
 * CellsWithOddValuesInAMatrix
 *
 * @author john 2020/8/2
 */
public class CellsWithOddValuesInAMatrix {
    class Solution {
        public int oddCells(int n, int m, int[][] indices) {
            int[][] matrix = new int[n][m];
            for (int[] index : indices) {
                for (int i = 0; i < m; i++) {
                    matrix[index[0]][i]++;
                }
                for (int i = 0; i < n; i++) {
                    matrix[i][index[1]]++;
                }
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if ((matrix[i][j] & 1) == 1) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
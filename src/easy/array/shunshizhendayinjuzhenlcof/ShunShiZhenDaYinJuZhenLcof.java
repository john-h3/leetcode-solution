package easy.array.shunshizhendayinjuzhenlcof;

/**
 * ShunShiZhenDaYinJuZhenLcof
 *
 * @author john 2020/8/7
 */
public class ShunShiZhenDaYinJuZhenLcof {
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            if (matrix.length == 0 || matrix[0].length == 0) {
                return new int[0];
            }
            int row = matrix.length;
            int col = matrix[0].length;
            int[] answer = new int[row * col];
            int top = 0, bottom = row - 1, left = 0, right = col - 1;
            int idx = 0;
            while (top <= bottom && left <= right) {
                for (int c = left; c <= right; c++) {
                    answer[idx++] = matrix[top][c];
                }
                for (int r = top + 1; r < bottom; r++) {
                    answer[idx++] = matrix[r][right];
                }
                if (top != bottom) {
                    for (int c = right; c >= left; c--) {
                        answer[idx++] = matrix[bottom][c];
                    }
                }
                if (left != right) {
                    for (int r = bottom - 1; r > top; r--) {
                        answer[idx++] = matrix[r][left];
                    }
                }
                top++;
                bottom--;
                left++;
                right--;
            }
            return answer;
        }
    }
}
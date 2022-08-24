package daily._20220823;

import java.util.Arrays;

public class Daily {
    class Solution {
        public int movesToChessboard(int[][] board) {
            int[] row1 = null, row2 = null;
            int row1c = 0, row2c = 0;
            for (int[] row : board) {
                if (row1 == null) {
                    row1 = row;
                    row1c = 1;
                }
                if (row2 == null && !Arrays.equals(row, row1)) {
                    row2 = row;
                    row2c = 1;
                }
                if (Arrays.equals(row, row1)) {
                    row1c++;
                } else if (Arrays.equals(row, row2)) {
                    row2c++;
                } else {
                    return -1;
                }
            }
            if (Math.abs(row1c - row2c) > 1) {
                return -1;
            }
            var sum1 = 0;
            for (int i : row1) {
                sum1 += i == 0 ? -1 : 1;
            }
            if (Math.abs(sum1) > 1) {
                return -1;
            }
            var sum2 = 0;
            for (int i : row2) {
                sum2 += i == 0 ? -1 : 1;
            }
            if (Math.abs(sum2) > 1) {
                return -1;
            }
            if (sum1 == sum2 && sum1 + sum2 != 0) {
                return -1;
            }
            for (int i = 0; i < row1.length; i++) {
                if (row1[i] + row2[i] != 1) {
                    return -1;
                }
            }

            if (row1c > row2c) {
                return minStep(sum1 > 0 ? 1 : 0, row1, board);
            } else if (row1c < row2c) {
                return minStep(sum2 > 0 ? 1 : 0, row2, board);
            } else {
                return Math.min(minStep(0, row1, board), minStep(1, row1, board));
            }
        }

        private int minStep(int n, int[] row, int[][] board) {
            var needSwap = 0;
            var mask = n == 0 ? new int[]{0, 1} : new int[]{1, 0};
            var r = 0;
            for (int i = 0; i < board.length; i++) {
                if (Arrays.equals(board[i], row)) {
                    r = i;
                    break;
                }
            }
            for (int i = 0; i < board.length; i++) {
                needSwap += board[r][i] == mask[i % 2] ? 0 : 1;
            }
            var c = 0;
            for (int i = 0; i < board.length; i++) {
                if (board[r][i] == n) {
                    c = i;
                }
            }
            for (int i = 0; i < board.length; i++) {
                needSwap += board[i][c] == mask[i % 2] ? 0 : 1;
            }
            return needSwap / 2;
        }
    }

}

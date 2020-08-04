package easy.array.findwinneronatictactoegame;

/**
 * FindWinnerOnATicTacToeGame
 *
 * @author john 2020/8/4
 */
public class FindWinnerOnATicTacToeGame {
    class Solution {
        public String tictactoe(int[][] moves) {
            int[][] board = new int[3][3];
            int[] sums = new int[8];
            int k = -1;
            for (int i = 0; i < moves.length; i++) {
                board[moves[i][0]][moves[i][1]] = k = -k;
                if (i > 3) {
                    for (int j = 0; j < 3; j++) {
                        sums[j] = board[j][0] + board[j][1] + board[j][2];
                    }
                    for (int j = 0; j < 3; j++) {
                        sums[j + 3] = board[0][j] + board[1][j] + board[2][j];
                    }
                    sums[6] = board[0][0] + board[1][1] + board[2][2];
                    sums[7] = board[0][2] + board[1][1] + board[2][0];
                    for (int sum : sums) {
                        if (sum == 3) {
                            return "A";
                        } else if (sum == -3) {
                            return "B";
                        }
                    }
                }
            }
            if (moves.length < 9) {
                return "Pending";
            } else {
                return "Draw";
            }
        }
    }
}
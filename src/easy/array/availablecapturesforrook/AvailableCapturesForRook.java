package easy.array.availablecapturesforrook;

/**
 * AvailableCapturesForRook
 *
 * @author john 2020/6/11
 */
public class AvailableCapturesForRook {
    class Solution {
        public int numRookCaptures(char[][] board) {
            int num = 4;
            int x = -1;
            int y = -1;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (board[i][j] == 'R') {
                        x = j;
                        y = i;
                        break;
                    }
                }
            }
            if (y == 0) {
                num--;
            } else {
                for (int i = y - 1; i >= 0; i--) {
                    if (board[i][x] == 'B') {
                        num--;
                        break;
                    } else if (board[i][x] == 'p') {
                        break;
                    } else if (i == 0) {
                        num--;
                    }
                }
            }
            if (y == 7) {
                num--;
            } else {
                for (int i = y + 1; i < 8; i++) {
                    if (board[i][x] == 'B') {
                        num--;
                        break;
                    } else if (board[i][x] == 'p') {
                        break;
                    } else if (i == 7) {
                        num--;
                    }
                }
            }
            if (x == 0) {
                num--;
            } else {
                for (int i = x - 1; i >= 0; i--) {
                    if (board[y][i] == 'B') {
                        num--;
                        break;
                    } else if (board[y][i] == 'p') {
                        break;
                    } else if (i == 0) {
                        num--;
                    }
                }
            }
            if (x == 7) {
                num--;
            } else {
                for (int i = x + 1; i < 8; i++) {
                    if (board[y][i] == 'B') {
                        num--;
                        break;
                    } else if (board[y][i] == 'p') {
                        break;
                    } else if (i == 7) {
                        num--;
                    }
                }
            }
            return num;
        }
    }
}
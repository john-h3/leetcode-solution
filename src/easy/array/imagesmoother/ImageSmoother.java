package easy.array.imagesmoother;

/**
 * ImageSmoother
 *
 * @author john 2020/6/1
 */
public class ImageSmoother {
    class Solution {
        public int[][] imageSmoother(int[][] M) {
            int[][] res = new int[M.length][M[0].length];
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[0].length; j++) {
                    calculate(res, M, j, i);
                }
            }
            return res;
        }

        private void calculate(int[][] g, int[][] M, int x, int y) {
            int sum = 0;
            int count = 0;
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int p1 = x + j;
                    int p2 = y + i;
                    if (p1 >= 0 && p2 >= 0 && p1 < M[0].length && p2 < M.length) {
                        sum += M[p2][p1];
                        count++;
                    }
                }
            }
            g[y][x] = sum / count;
        }
    }
}
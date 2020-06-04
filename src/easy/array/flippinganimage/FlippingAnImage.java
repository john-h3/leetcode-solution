package easy.array.flippinganimage;

/**
 * FlippingAnImage
 *
 * @author john 2020/6/4
 */
public class FlippingAnImage {
    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            int row = A.length;
            int col = A[0].length;
            int[][] result = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    result[i][j] = A[i][col - 1 - j] == 1 ? 0 : 1;
                }
            }
            return result;
        }
    }
}
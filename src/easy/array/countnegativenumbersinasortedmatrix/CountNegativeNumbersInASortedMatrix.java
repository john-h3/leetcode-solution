package easy.array.countnegativenumbersinasortedmatrix;

/**
 * CountNegativeNumbersInASortedMatrix
 *
 * @author john 2020/8/6
 */
public class CountNegativeNumbersInASortedMatrix {
    class Solution {
        public int countNegatives(int[][] grid) {
            int count = 0;
            int col = grid[0].length - 1;
            for (int row = 0; row < grid.length; row++) {
                while (col >= 0) {
                    if (grid[row][col] < 0) {
                        count += grid.length - row;
                        col--;
                    } else {
                        break;
                    }
                }
            }
            return count;
        }
    }
}
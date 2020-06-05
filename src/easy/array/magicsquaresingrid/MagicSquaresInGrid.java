package easy.array.magicsquaresingrid;

/**
 * MagicSquaresInGrid
 *
 * @author john 2020/6/5
 */
public class MagicSquaresInGrid {
    class Solution {
        private final int[] magicInt = {
                816357492,
                618753294,
                492357816,
                294753618,
                672159834,
                834159672,
                276951438,
                438951276
        };

        public int numMagicSquaresInside(int[][] grid) {
            if (grid.length < 3 || grid[0].length < 3) {
                return 0;
            }
            int count = 0;
            for (int i = 0; i < grid.length - 2; i++) {
                for (int j = 0; j < grid[0].length - 2; j++) {
                    if (check(j, i, grid)) {
                        count++;
                    }
                }
            }
            return count;
        }

        private boolean check(int x, int y, int[][] grid) {
            int integer = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int v = grid[y + i][x + j];
                    if (v > 9 || v < 1) {
                        return false;
                    }
                    integer = integer * 10 + v;
                }
            }
            for (int i : magicInt) {
                if (i == integer) {
                    return true;
                }
            }
            return false;
        }
    }
}
package easy.array.numberofequivalentdominopairs;

/**
 * NumberOfEquivalentDominoPairs
 *
 * @author john 2020/6/19
 */
public class NumberOfEquivalentDominoPairs {
    class Solution {
        public int numEquivDominoPairs(int[][] dominoes) {
            int[][] grid = new int[10][10];
            for (int[] domino : dominoes) {
                grid[Math.min(domino[0], domino[1])][Math.max(domino[0], domino[1])]++;
            }
            int count = 0;
            for (int[] row : grid) {
                for (int i : row) {
                    count += i * (i - 1) / 2;
                }
            }
            return count;
        }
    }
}
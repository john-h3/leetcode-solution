package easy.array.numberofgoodpairs;

/**
 * NumberOfGoodPairs
 *
 * @author john 2020/8/7
 */
public class NumberOfGoodPairs {
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int[] hash = new int[101];
            for (int num : nums) {
                hash[num]++;
            }
            int count = 0;
            for (int c : hash) {
                if (c > 1) {
                    count += c * (c - 1) / 2;
                }
            }
            return count;
        }
    }
}
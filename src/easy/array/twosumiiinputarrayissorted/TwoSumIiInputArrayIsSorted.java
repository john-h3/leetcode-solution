package easy.array.twosumiiinputarrayissorted;

/**
 * TwoSumIiInputArrayIsSorted
 *
 * @author john 2020/4/26
 */
public class TwoSumIiInputArrayIsSorted {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int[] map = new int[0x3ff + 1];
            for (int i = 0; i < numbers.length; i++) {
                int diffHash = (target - numbers[i]) & 0x3ff;
                int diffIdx = map[diffHash];
                if (diffIdx != 0) {
                    return new int[]{diffIdx, i + 1};
                } else {
                    int curHash = numbers[i] & 0x3ff;
                    if (map[curHash] == 0) {
                        map[curHash] = i + 1;
                    }
                }
            }
            throw new RuntimeException();
        }
    }
}
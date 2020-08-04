package easy.array.findnumberswithevennumberofdigits;
/**
 * FindNumbersWithEvenNumberOfDigits
 * 
 * @author john 2020/8/4
 */
public class FindNumbersWithEvenNumberOfDigits {
    class Solution {
        public int findNumbers(int[] nums) {
            int count = 0;
            for (int num : nums) {
                if (num >= 10 && num < 100) {
                    count++;
                } else if (num >= 1000 && num < 10000) {
                    count++;
                } else if (num == 100000) {
                    count++;
                }
            }
            return count;
        }
    }
}
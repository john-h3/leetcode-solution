package easy.string.splitastringinbalancedstrings;

/**
 * SplitAStringInBalancedStrings
 * 
 * @author john 2020/8/16
 */
public class SplitAStringInBalancedStrings {
    class Solution {
        public int balancedStringSplit(String s) {
            int count = 0;
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'L') {
                    sum++;
                } else {
                    sum--;
                }
                if (sum == 0) {
                    count++;
                }
            }
            return count;
        }
    }
}
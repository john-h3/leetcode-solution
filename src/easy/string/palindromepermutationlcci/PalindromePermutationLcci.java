package easy.string.palindromepermutationlcci;

/**
 * PalindromePermutationLcci
 * 
 * @author john 2020/8/18
 */
public class PalindromePermutationLcci {
    class Solution {
        public boolean canPermutePalindrome(String s) {
            char[] chars = s.toCharArray();
            int[] counter = new int[0x7f];
            for (char c : chars) {
                counter[c]++;
            }
            int oddCount = 0;
            for (int c : counter) {
                if ((c & 1) == 1) {
                    oddCount++;
                    if (oddCount > 1) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
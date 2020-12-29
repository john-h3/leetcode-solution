package easy.math.palindromenumber;

/**
 * PalindromeNumber
 * 
 * @author john 2020/12/29
 */
public class PalindromeNumber {
    class Solution {
        public boolean isPalindrome(int x) {
            StringBuilder sb = new StringBuilder();
            sb.append(x);
            return sb.toString().equals(sb.reverse().toString());
        }
    }
}
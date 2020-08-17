package easy.string.removepalindromicsubsequences;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * RemovePalindromicSubsequences
 *
 * @author john 2020/8/17
 */
public class RemovePalindromicSubsequences {
    class Solution {
        public int removePalindromeSub(String s) {
            if (s.isEmpty()) {
                return 0;
            }
            int startIdx = 0;
            int endIdx = s.length() - 1;
            boolean isPalindrome = true;
            while (startIdx < endIdx) {
                if (s.charAt(startIdx) != s.charAt(endIdx)) {
                    isPalindrome = false;
                    break;
                }
                startIdx++;
                endIdx--;
            }
            return isPalindrome ? 1 : 2;
        }
    }
}
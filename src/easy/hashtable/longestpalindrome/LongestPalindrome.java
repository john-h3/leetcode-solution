package easy.hashtable.longestpalindrome;

/**
 * LongestPalindrome
 *
 * @author john 2021/2/9
 */
public class LongestPalindrome {
  class Solution {
    public int longestPalindrome(String s) {
      var table = new int[0x7f];
      for (char c : s.toCharArray()) {
        table[c]++;
      }
      var l = 0;
      var odd = false;
      for (int i = 0; i < table.length; i++) {
        l += table[i] >> 1 << 1;
        if ((table[i] & 1) == 1) odd = true;
      }
      return odd ? l + 1 : l;
    }
  }
}
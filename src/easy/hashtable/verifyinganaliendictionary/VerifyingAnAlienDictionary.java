package easy.hashtable.verifyinganaliendictionary;
/**
 * VerifyingAnAlienDictionary
 *
 * @author john 2021/2/13
 */
public class VerifyingAnAlienDictionary {
  class Solution {
    int[] orderTable = new int[26];
    
    public boolean isAlienSorted(String[] words, String order) {
      for (int i = 0; i < order.length(); i++) {
        orderTable[order.charAt(i) - 'a'] = i;
      }
      for (int i = 0; i < words.length - 1; i++) {
        if (!compare(words[i], words[i+1])) return false;
      }
      return true;
    }

    private boolean compare(String s1, String s2) {
      var minLen = Math.min(s1.length(), s2.length());
      for (int i = 0; i < minLen; i++) {
        int o1 = orderTable[s1.charAt(i) - 'a'];
        int o2 = orderTable[s2.charAt(i) - 'a'];
        if (o1 < o2) return true;
        else if (o1 > o2) return false;
      }
      return s1.length() == minLen;
    }
  }
}

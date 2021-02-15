package easy.hashtable.diyigezhichuxianyicidezifulcof;

import java.util.Arrays;

/**
 * DiYiGeZhiChuXianYiCiDeZiFuLcof
 *
 * @author john 2021/2/15
 */
public class DiYiGeZhiChuXianYiCiDeZiFuLcof {
  class Solution {
    public char firstUniqChar(String s) {
      var table = new int[26];
      char[] chars = s.toCharArray();
      for (char c : chars) {
        table[c - 'a'] = table[c - 'a'] == 0 ? 1 : -1;
      }
      for (char c : chars) {
        if (table[c - 'a'] == 1) return c;
      }
      return ' ';
    }
  }
}

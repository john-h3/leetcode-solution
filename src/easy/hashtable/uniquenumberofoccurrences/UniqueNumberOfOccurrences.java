package easy.hashtable.uniquenumberofoccurrences;
/**
 * UniqueNumberOfOccurrences
 *
 * @author john 2021/2/14
 */
public class UniqueNumberOfOccurrences {
  class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      var counter = new int[2001];
      for (int num : arr) {
        counter[num + 1000]++;
      }
      var table = new int[2001];
      for (int c : counter) {
        if (c > 0) table[c]++;
        if (table[c] == 2) return false;
      }
      return true;
    }
  }
}

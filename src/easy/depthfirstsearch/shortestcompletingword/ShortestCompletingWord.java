package easy.depthfirstsearch.shortestcompletingword;
/**
 * ShortestCompletingWord
 *
 * @author john 2021/2/12
 */
public class ShortestCompletingWord {
  class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
      var table = getTable(licensePlate.toLowerCase());
      var length = Integer.MAX_VALUE;
      var result = words[0];
      OUT: for (String word : words) {
        var tab = getTable(word);
        for (int i = 0; i < table.length; i++) {
          if (table[i] > tab[i]) continue OUT;
        }
        if (word.length() < length) {
          length = word.length();
          result = word;
        }
      }
      return result;
    }

    private int[] getTable(String str) {
      var table = new int[26];
      for (char c : str.toCharArray()) {
        if (c >= 'a' && c <= 'z') table[c - 'a']++;
      }
      return table;
    }
  }

  public static void main(String[] args) {
    new ShortestCompletingWord().new Solution()
        .shortestCompletingWord("1s3 PSt", new String[] {"step", "steps", "stripe", "stepple"});
  }
}

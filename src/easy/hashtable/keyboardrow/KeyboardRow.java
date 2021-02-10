package easy.hashtable.keyboardrow;

import java.util.ArrayList;

/**
 * KeyboardRow
 *
 * @author john 2021/2/10
 */
public class KeyboardRow {
  class Solution {
    public String[] findWords(String[] words) {
      var table = new int[0x7f];
      initTable(table, "qwertyuiop", 1);
      initTable(table, "asdfghjkl", 2);
      initTable(table, "zxcvbnm", 3);
      
      var list = new ArrayList<String>();
      OUT: for (var word : words) {
        var r = table[word.charAt(0)];
        for (char c : word.toCharArray()) {
          if (table[c] != r) continue OUT;
        }
        list.add(word);
      }
      return list.toArray(String[]::new);
    }
    
    private void initTable(int[] table, String row, int flag) {
      for (char c : row.toCharArray()) {
        table[c] = flag;
      }
      for (char c : row.toUpperCase().toCharArray()) {
        table[c] = flag;
      }
    }
  }
}
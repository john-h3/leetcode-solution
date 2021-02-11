package easy.hashtable.minimumindexsumoftwolists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * MinimumIndexSumOfTwoLists
 *
 * @author john 2021/2/11
 */
public class MinimumIndexSumOfTwoLists {
  class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
      var hashMap = new HashMap<String, int[]>();
      for (int i = 0; i < list1.length; i++) {
        hashMap.put(list1[i], new int[]{1,i});
      }
      for (int i = 0; i < list2.length; i++) {
        var v = hashMap.get(list2[i]);
        if (v != null) {
          hashMap.put(list2[i], new int[]{2, i+v[1]});
        }
      }
      int min = Integer.MAX_VALUE;
      var list = new ArrayList<String>();
      for (Map.Entry<String, int[]> entry : hashMap.entrySet()) {
        var k = entry.getKey();
        var v = entry.getValue();
        if (v[0] == 2) {
          if (v[1] < min) {
            list.clear();
            min = v[1];
            list.add(k);
          } else if (v[1] == min) {
            list.add(k);
          }
        }
      }
      return list.toArray(String[]::new);
    }
  }
}

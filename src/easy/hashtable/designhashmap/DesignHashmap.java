package easy.hashtable.designhashmap;

import java.util.ArrayList;

/**
 * DesignHashmap
 *
 * @author john 2021/2/11
 */
public class DesignHashmap {
  class MyHashMap {
    private int bit = 8;
    private ArrayList<int[]>[] lists = new ArrayList[1 << (20 - bit)];

    public void put(int key, int value) {
      if (lists[key >> bit] == null) lists[key >> bit] = new ArrayList<>();
      var exist = false;
      for (int[] ints : lists[key >> bit])
        if (ints[0] == key) {
          ints[1] = value;
          exist = true;
        }
      if (!exist) lists[key >> bit].add(new int[] {key, value});
    }

    public int get(int key) {
      if (lists[key >> bit] != null)
        for (int[] ints : lists[key >> bit]) if (ints[0] == key) return ints[1];
      return -1;
    }

    public void remove(int key) {
      if (lists[key >> bit] != null) lists[key >> bit].removeIf(e -> e[0] == key);
    }
  }
}

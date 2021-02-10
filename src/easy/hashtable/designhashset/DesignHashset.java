package easy.hashtable.designhashset;

import java.util.ArrayList;

/**
 * DesignHashset
 *
 * @author john 2021/2/11
 */
public class DesignHashset {
  class MyHashSet {
    private ArrayList<Integer>[] lists;
    private int bit = 9;

    public MyHashSet() {
      lists = new ArrayList[1 << (20 - bit)];
    }

    public void add(int key) {
      if (lists[key >> bit] == null) lists[key >> bit] = new ArrayList<>();
      lists[key >> bit].add(key);
    }

    public void remove(int key) {
      if (lists[key >> bit] != null) lists[key >> bit].removeIf(i -> i == key);
    }

    public boolean contains(int key) {
      if (lists[key >> bit] == null) return false;
      return lists[key >> bit].contains(key);
    }
  }
}

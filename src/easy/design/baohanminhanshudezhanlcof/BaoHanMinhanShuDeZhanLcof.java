package easy.design.baohanminhanshudezhanlcof;

import java.util.*;

/**
 * BaoHanMinhanShuDeZhanLcof
 *
 * @author john 2021/3/3
 */
public class BaoHanMinhanShuDeZhanLcof {
  class MinStack {
    Deque<Integer> deque = new ArrayDeque<>();
    Map<Integer, Integer> map = new HashMap<>();

    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int x) {
      deque.push(x);
      map.put(deque.size(), Math.min(x, map.getOrDefault(deque.size() - 1, Integer.MAX_VALUE)));
    }

    public void pop() {
      deque.pop();
    }

    public int top() {
      return deque.getFirst();
    }

    public int min() {
      return map.get(deque.size());
    }
  }
}
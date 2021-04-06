package easy.heap.hanotalcci;

import java.util.List;

/**
 * HanotaLcci
 *
 * @author john 2021/4/6
 */
public class HanotaLcci {
  class Solution {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
      move(A, C, B, A.size());
    }

    private void move(List<Integer> from, List<Integer> to, List<Integer> temp, int num) {
      if (num > 0) {
        move(from, temp, to, num - 1);
        to.add(0, from.remove(0));
        move(temp, to, from, num - 1);
      }
    }
  }
}

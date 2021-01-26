package easy.tree.findmodeinbinarysearchtree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FindModeInBinarySearchTree
 *
 * @author john 2021/1/27
 */
public class FindModeInBinarySearchTree {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  class Solution {
    private Map<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {
      recursiveCount(root);
      if (map.isEmpty()) return new int[0];
      Integer max = map.values().stream().max(Integer::compareTo).orElseThrow();
      return map.keySet().stream()
          .filter(e -> map.get(e).equals(max))
          .mapToInt(Integer::intValue)
          .toArray();
    }

    private void recursiveCount(TreeNode root) {
      if (root != null) {
        map.merge(root.val, 1, Integer::sum);
        recursiveCount(root.left);
        recursiveCount(root.right);
      }
    }
  }
}

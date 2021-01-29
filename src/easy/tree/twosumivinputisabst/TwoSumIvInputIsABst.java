package easy.tree.twosumivinputisabst;

import java.util.HashMap;
import java.util.Map;

/**
 * TwoSumIvInputIsABst
 *
 * @author john 2021/1/30
 */
public class TwoSumIvInputIsABst {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  class Solution {
    private Map<Integer, Integer> map = new HashMap<>();

    public boolean findTarget(TreeNode root, int k) {
      if (root != null) {
        map.merge(root.val, 1, Integer::sum);
        var diff = k - root.val;
        return (diff == root.val ? map.get(diff) == 2 : map.get(diff) != null)
            || findTarget(root.left, k)
            || findTarget(root.right, k);
      } else return false;
    }
  }
}

package easy.tree.minimumabsolutedifferenceinbst;

import java.util.ArrayList;
import java.util.List;

/**
 * MinimumAbsoluteDifferenceInBst
 *
 * @author john 2021/1/27
 */
public class MinimumAbsoluteDifferenceInBst {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  class Solution {
    private List<Integer> nodes = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
      inOrderIterate(root);
      var min = nodes.get(1) - nodes.get(0);
      for (int i = 2; i < nodes.size(); i++) {
        min = Math.min(nodes.get(i) - nodes.get(i - 1), min);
      }
      return min;
    }

    private void inOrderIterate(TreeNode root) {
      if (root != null) {
        if (root.left == root.right) nodes.add(root.val);
        else {
          inOrderIterate(root.left);
          nodes.add(root.val);
          inOrderIterate(root.right);
        }
      }
    }
  }
}

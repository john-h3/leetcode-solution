package easy.tree.trimabinarysearchtree;

import java.util.TreeSet;

/**
 * TrimABinarySearchTree
 *
 * @author john 2021/1/30
 */
public class TrimABinarySearchTree {
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
    Integer min = null;
    Integer second = null;

    public int findSecondMinimumValue(TreeNode root) {
      LNR(root);
      return second == null ? -1 : second;
    }

    private void LNR(TreeNode root) {
      if (root != null) {
        if (min == null || root.val < min) {
          second = min;
          min = root.val;
        } else if (root.val > min && (second == null || root.val < second)) {
          second = root.val;
        }
        LNR(root.left);
        LNR(root.right);
      }
    }
  }
}

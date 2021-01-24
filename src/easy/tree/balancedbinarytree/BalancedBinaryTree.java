package easy.tree.balancedbinarytree;

/**
 * BalancedBinaryTree
 *
 * @author john 2021/1/25
 */
public class BalancedBinaryTree {
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
    public boolean isBalanced(TreeNode root) {
      if (root != null) {
        var lH = getTreeHeight(root.left);
        var rH = getTreeHeight(root.right);
        return Math.abs(lH - rH) <= 1 && isBalanced(root.left) && isBalanced(root.right);
      }
      return true;
    }

    private int getTreeHeight(TreeNode root) {
      if (root == null) {
        return 0;
      } else {
        return 1 + Math.max(getTreeHeight(root.left), getTreeHeight(root.right));
      }
    }
  }
}

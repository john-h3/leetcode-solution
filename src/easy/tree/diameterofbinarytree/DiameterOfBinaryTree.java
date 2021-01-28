package easy.tree.diameterofbinarytree;

/**
 * DiameterOfBinaryTree
 *
 * @author john 2021/1/28
 */
public class DiameterOfBinaryTree {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  class Solution {
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
      getTreeHeight(root);
      return max;
    }

    private int getTreeHeight(TreeNode root) {
      if (root != null) {
        var lH = getTreeHeight(root.left);
        var rH = getTreeHeight(root.right);
        max = Math.max(max, lH + rH);
        return Math.max(1 + lH, 1 + rH);
      }
      return 0;
    }
  }
}

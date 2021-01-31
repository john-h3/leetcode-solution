package easy.tree.univaluedbinarytree;

/**
 * UnivaluedBinaryTree
 *
 * @author john 2021/2/1
 */
public class UnivaluedBinaryTree {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  class Solution {
    public boolean isUnivalTree(TreeNode root) {
      return LNR(root, root.val);
    }

    private boolean LNR(TreeNode root, int v) {
      if (root != null) {
        return LNR(root.left, v) && root.val == v && LNR(root.right, v);
      }
      return true;
    }
  }
}

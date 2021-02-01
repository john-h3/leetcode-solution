package easy.tree.cousinsinbinarytree;

/**
 * CousinsInBinaryTree
 *
 * @author john 2021/2/1
 */
public class CousinsInBinaryTree {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
  class Solution {
    private int depth;
    private TreeNode parentNode;
    
    public boolean isCousins(TreeNode root, int x, int y) {
      if (root.left == root.right) return false;
      LNR(root, x, 0);
      var xP = parentNode;
      var xD = depth;
      if (xP == null) return false;
      parentNode = null;
      LNR(root, y, 0);
      var yP = parentNode;
      var yD = depth;
      return xP != yP && xD == yD;
    }
    
    private void LNR(TreeNode root, int v, int depth) {
      if (root != null) {
        LNR(root.left, v, depth + 1);
        if (root.val == v) this.depth = depth;
        if (root.left != null && root.left.val == v) {
          parentNode = root;
        }
        if (root.right != null && root.right.val == v) {
          parentNode = root;
        }
        LNR(root.right, v, depth + 1);
      }
    }
  }
}
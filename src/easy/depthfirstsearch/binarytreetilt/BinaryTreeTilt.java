package easy.depthfirstsearch.binarytreetilt;
/**
 * BinaryTreeTilt
 *
 * @author john 2021/2/11
 */
public class BinaryTreeTilt {
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
    public int findTilt(TreeNode root) {
      if (root == null) return 0;
      return findTilt(root.left) + findTilt(root.right) + Math.abs(sum(root.left) - sum(root.right));
    }
    
    private int sum(TreeNode node) {
      if (node != null) return node.val + sum(node.left) + sum(node.right);
      else return 0;
    }
  }
}

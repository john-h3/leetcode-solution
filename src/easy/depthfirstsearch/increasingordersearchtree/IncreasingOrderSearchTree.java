package easy.depthfirstsearch.increasingordersearchtree;
/**
 * IncreasingOrderSearchTree
 *
 * @author john 2021/2/11
 */
public class IncreasingOrderSearchTree {
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
    private TreeNode root;
    private TreeNode parentNode;
    public TreeNode increasingBST(TreeNode root) {
      LNR(root);
      return this.root;
    }
    
    private void LNR(TreeNode node) {
      if (node != null) {
        LNR(node.left);
        if (root == null) root = parentNode = new TreeNode(node.val);
        else {
          parentNode.right = new TreeNode(node.val);
          parentNode = parentNode.right;
        }
        LNR(node.right);
      }
    }
  }
}

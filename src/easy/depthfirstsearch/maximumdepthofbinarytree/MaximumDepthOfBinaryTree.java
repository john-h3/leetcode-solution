package easy.depthfirstsearch.maximumdepthofbinarytree;

/**
 * MaximumDepthOfBinaryTree
 *
 * @author john 2021/2/5
 */
public class MaximumDepthOfBinaryTree {
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
    public int maxDepth(TreeNode root) {
      return NLR(root);
    }
    
    private int NLR(TreeNode n) {
      if (n == null) return 0;
      else {
        return 1 + Math.max(NLR(n.left), NLR(n.right));
      }
    }
  }
}
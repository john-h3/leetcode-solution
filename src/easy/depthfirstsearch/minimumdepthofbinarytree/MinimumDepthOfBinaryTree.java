package easy.depthfirstsearch.minimumdepthofbinarytree;
/**
 * MinimumDepthOfBinaryTree
 *
 * @author john 2021/2/6
 */
public class MinimumDepthOfBinaryTree {
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
    public int minDepth(TreeNode root) {
      if (root == null) return 0;
      return dfs(root);
    }
    
    private int dfs(TreeNode n) {
      if (n.left == n.right) return 1;
      else if (n.left == null) return 1 + dfs(n.right);
      else if (n.right == null) return 1 + dfs(n.left);
      else return 1 + Math.min(dfs(n.left), dfs(n.right));
    } 
  }
}

package easy.depthfirstsearch.balancedbinarytree;

import java.util.HashMap;
import java.util.Map;

/**
 * BalancedBinaryTree
 *
 * @author john 2021/2/6
 */
public class BalancedBinaryTree {
  public static class TreeNode {
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
    private Map<TreeNode, Integer> map = new HashMap<>();
    
    public boolean isBalanced(TreeNode root) {
      if (root == null) return true;
      else return isBalanced(root.left) && isBalanced(root.right) && Math.abs(depth(root.left) - depth(root.right)) <= 1;
    }
    
    private int depth(TreeNode n) {
      var depth = map.get(n);
      if (depth == null) {
        if (n == null) map.put(n, 0);
        else if (n.left == n.right) map.put(n, 1);
        else map.put(n, 1 + Math.max(depth(n.left), depth(n.right)));
        depth = map.get(n);
      }
      return depth;
    }
  }

  public static void main(String[] args) {
    new BalancedBinaryTree().new Solution().isBalanced(new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3))));
  }
}

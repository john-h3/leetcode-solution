package easy.tree.checkbalancelcci;

import java.util.HashSet;
import java.util.Set;

/**
 * CheckBalanceLcci
 *
 * @author john 2021/2/5
 */
public class CheckBalanceLcci {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  class Solution {
    public boolean isBalanced(TreeNode root) {
      if(root == null) return true;
      return Math.abs(depth(root.left) - depth(root.right)) <= 1
          && isBalanced(root.left)
          && isBalanced(root.right);
    }
    
    private int depth(TreeNode node) {
      if (node == null) return 0;
      else return 1 + Math.max(depth(node.left), depth(node.right));
    }
  }
}

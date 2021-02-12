package easy.depthfirstsearch.pinghengerchashulcof;
/**
 * PingHengErChaShuLcof
 *
 * @author john 2021/2/12
 */
public class PingHengErChaShuLcof {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
  class Solution {
    public boolean isBalanced(TreeNode root) {
      if (root == null) return true;
      else return isBalanced(root.left) && isBalanced(root.right) && Math.abs(depth(root.left) - depth(root.right)) <= 1;
    }
    
    private int depth(TreeNode node) {
      if (node != null) {
        return 1 + Math.max(depth(node.left), depth(node.right));
      }
      return 0;
    }
  }  
}

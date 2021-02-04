package easy.tree.pinghengerchashulcof;

/**
 * PingHengErChaShuLcof
 *
 * @author john 2021/2/4
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
//      assert root != null;
      LRN(root);
      return NLR(root);
    }
    
    private boolean NLR(TreeNode n) {
      if (n != null) {
        var lDepth = n.left == null ? 0 : n.left.val;
        var rDepth = n.right == null ? 0 : n.right.val;
        return Math.abs(lDepth - rDepth) <= 1 && NLR(n.left) && NLR(n.right);
      }
      return true;
    }
    
    private void LRN(TreeNode n) {
      if (n != null) {
        LRN(n.left);
        LRN(n.right);
        if (n.left == n.right) n.val = 1;
        else {
          var lDepth = n.left == null ? 0 : n.left.val;
          var rDepth = n.right == null ? 0 : n.right.val;
          n.val = 1 + Math.max(lDepth, rDepth);
        }
      }
    }
  }
}
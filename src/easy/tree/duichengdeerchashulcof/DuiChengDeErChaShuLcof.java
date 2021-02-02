package easy.tree.duichengdeerchashulcof;

/**
 * DuiChengDeErChaShuLcof
 *
 * @author john 2021/2/2
 */
public class DuiChengDeErChaShuLcof {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
  class Solution {
    public boolean isSymmetric(TreeNode root) {
      if (root == null) return true;
      if (root.left == root.right) return true;
      return LNR(root.left, root.right);
    }
    
    private boolean LNR(TreeNode n1, TreeNode n2) {
      if (n1 == n2) return true;
      else if (n1 == null || n2 == null) return false;
      else return LNR(n1.left, n2.right) && n1.val == n2.val && LNR(n1.right, n2.left);
    }
  }
}
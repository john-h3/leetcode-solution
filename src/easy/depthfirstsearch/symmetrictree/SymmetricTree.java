package easy.depthfirstsearch.symmetrictree;

/**
 * SymmetricTree
 *
 * @author john 2021/2/5
 */
public class SymmetricTree {
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
    public boolean isSymmetric(TreeNode root) {
      if (root == null) return true;
      return NLP(root.left, root.right);
    }

    private boolean NLP(TreeNode n1, TreeNode n2) {
      if (n1 == n2) return true;
      else if (n1 == null || n2 == null) return false;
      return n1.val == n2.val && NLP(n1.left, n2.right) && NLP(n1.right, n2.left);
    }
  }
}
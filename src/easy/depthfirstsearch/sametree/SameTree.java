package easy.depthfirstsearch.sametree;

/**
 * SameTree
 *
 * @author john 2021/2/5
 */
public class SameTree {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
      if (p == q) return true;
      else if (p == null || q == null) return false;
      return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
  }
}
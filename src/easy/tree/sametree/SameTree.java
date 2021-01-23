package easy.tree.sametree;
/**
 * SameTree
 *
 * @author john 2021/1/23
 */
public class SameTree {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
      if (p == null ^ q == null) {
        return false;
      } else if (p != null) {
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
      }
      return true;
    }
  }
}

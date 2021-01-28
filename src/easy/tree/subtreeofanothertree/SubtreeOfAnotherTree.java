package easy.tree.subtreeofanothertree;
/**
 * SubtreeOfAnotherTree
 *
 * @author john 2021/1/29
 */
public class SubtreeOfAnotherTree {
  public static class TreeNode {
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
    public boolean isSubtree(TreeNode s, TreeNode t) {
      if (s != null) {
        return equals(s, t)
                || s.left != null && isSubtree(s.left, t)
                || s.right != null && isSubtree(s.right, t);
      }
      return false;
    }

    private boolean equals(TreeNode s, TreeNode t) {
      if (s == t) return true;
      else if (s == null ^ t == null) return false;
      else return s.val == t.val
              && equals(s.right, t.right) 
              && equals(s.left, t.left);
    }
  }
}

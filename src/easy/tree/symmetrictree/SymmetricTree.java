package easy.tree.symmetrictree;

/**
 * SymmetricTree
 *
 * @author john 2021/1/23
 */
public class SymmetricTree {
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
    public boolean isSymmetric(TreeNode root) {
      if (root == null) return true;
      return isSameAfterInvertOne(root.left, root.right);
    }

    private boolean isSameAfterInvertOne(TreeNode l, TreeNode r) {
      if (l == null ^ r == null) {
        return false;
      } else if (l != null) {
        return l.val == r.val
            && isSameAfterInvertOne(l.left, r.right)
            && isSameAfterInvertOne(l.right, r.left);
      }
      return true;
    }
  }
}

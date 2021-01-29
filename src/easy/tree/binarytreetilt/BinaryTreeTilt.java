package easy.tree.binarytreetilt;

/**
 * BinaryTreeTilt
 *
 * @author john 2021/1/30
 */
public class BinaryTreeTilt {
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
    private int sum = 0;

    public int findTilt(TreeNode root) {
      LRN(root);
      return sum;
    }

    private int LRN(TreeNode root) {
      if (root != null) {
        var l = LRN(root.left);
        var r = LRN(root.right);
        this.sum += Math.abs(l - r);
        return root.val + l + r;
      }
      return 0;
    }
  }
}

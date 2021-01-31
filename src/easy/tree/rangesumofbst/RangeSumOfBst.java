package easy.tree.rangesumofbst;

/**
 * RangeSumOfBst
 *
 * @author john 2021/2/1
 */
public class RangeSumOfBst {
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
    private int low;
    private int high;

    public int rangeSumBST(TreeNode root, int low, int high) {
      this.low = low;
      this.high = high;
      LNR(root);
      return sum;
    }

    private void LNR(TreeNode root) {
      if (root != null) {
        LNR(root.left);
        if (root.val >= low && root.val <= high) sum += root.val;
        LNR(root.right);
      }
    }
  }
}

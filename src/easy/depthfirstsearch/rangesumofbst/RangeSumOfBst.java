package easy.depthfirstsearch.rangesumofbst;
/**
 * RangeSumOfBst
 *
 * @author john 2021/2/11
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
    private int sum = 0, low, high;

    public int rangeSumBST(TreeNode root, int low, int high) {
      this.low = low;
      this.high = high;
      LNR(root);
      return sum;
    }

    private void LNR(TreeNode node) {
      if (node != null) {
        LNR(node.left);
        if (node.val >= low && node.val <= high) sum += node.val;
        LNR(node.right);
      }
    }
  }
}

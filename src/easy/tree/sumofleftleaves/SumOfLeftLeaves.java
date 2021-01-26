package easy.tree.sumofleftleaves;

/**
 * SumOfLeftLeaves
 *
 * @author john 2021/1/27
 */
public class SumOfLeftLeaves {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  class Solution {
    private int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
      if (root != null && root.left != root.right) {
        recursiveSum(root.left, true);
        recursiveSum(root.right, false);
      }
      return sum;
    }

    private void recursiveSum(TreeNode root, boolean isLeft) {
      if (root != null) {
        if (root.left == root.right && isLeft) sum += root.val;
        else {
          recursiveSum(root.left, true);
          recursiveSum(root.right, false);
        }
      }
    }
  }
}

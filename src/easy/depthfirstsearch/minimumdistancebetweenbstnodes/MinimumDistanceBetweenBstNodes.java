package easy.depthfirstsearch.minimumdistancebetweenbstnodes;
/**
 * MinimumDistanceBetweenBstNodes
 *
 * @author john 2021/2/11
 */
public class MinimumDistanceBetweenBstNodes {
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
    private int min = Integer.MAX_VALUE;
    private Integer prev;

    public int minDiffInBST(TreeNode root) {
      LNR(root);
      return min;
    }

    private void LNR(TreeNode node) {
      if (node != null) {
        LNR(node.left);
        if (prev != null) {
          min = Math.min(min, Math.abs(node.val - prev));
        }
        prev = node.val;
        LNR(node.right);
      }
    }
  }
}

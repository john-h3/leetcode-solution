package easy.tree.convertsortedarraytobinarysearchtree;

/**
 * ConvertSortedArrayToBinarySearchTree
 *
 * @author john 2021/1/25
 */
public class ConvertSortedArrayToBinarySearchTree {
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
    public TreeNode sortedArrayToBST(int[] nums) {
      if (nums.length == 0) return null;
      var result = new TreeNode();
      treefy(result, nums, 0, nums.length - 1);
      return result;
    }

    private void treefy(TreeNode root, int[] nums, int start, int end) {
      var mid = (end + start) / 2;
      root.val = nums[mid];
      if (start < mid) {
        root.left = new TreeNode();
        treefy(root.left, nums, start, mid - 1);
      }
      if (end > mid) {
        root.right = new TreeNode();
        treefy(root.right, nums, mid + 1, end);
      }
    }
  }
}

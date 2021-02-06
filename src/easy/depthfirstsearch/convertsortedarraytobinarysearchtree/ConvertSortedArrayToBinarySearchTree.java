package easy.depthfirstsearch.convertsortedarraytobinarysearchtree;
/**
 * ConvertSortedArrayToBinarySearchTree
 *
 * @author john 2021/2/6
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
    int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
      this.nums = nums;
      TreeNode root = null;
      if (nums.length > 0) {
        root = new TreeNode();
        treefy(root, 0, nums.length - 1);
      }
      return root;
    }

    private void treefy(TreeNode node, int start, int end) {
      var mid = (end - start) / 2 + start;
      node.val = nums[mid];
      if (mid - 1 >= start) treefy(node.left = new TreeNode(), start, mid - 1);
      if (mid + 1 <= end) treefy(node.right = new TreeNode(), mid + 1, end);
    }
  }
}

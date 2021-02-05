package easy.tree.minimumheighttreelcci;

import java.util.Arrays;

/**
 * MinimumHeightTreeLcci
 *
 * @author john 2021/2/5
 */
public class MinimumHeightTreeLcci {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
      TreeNode root = null;
      if (nums.length > 0) root = new TreeNode(nums[nums.length / 2]);
      addNodeToLeft(root, nums, 0, nums.length / 2 - 1);
      addNodeToRight(root, nums, nums.length / 2 + 1, nums.length - 1);
      return root;
    }

    private void addNodeToLeft(TreeNode node, int[] nums, int start, int end) {
      if (end >= start) {
        int mid = (end - start) / 2 + start;
        node.left = new TreeNode(nums[mid]);
        if (end > start) {
          addNodeToLeft(node.left, nums, start, mid - 1);
          addNodeToRight(node.left, nums, mid + 1, end);
        }
      }
    }

    private void addNodeToRight(TreeNode node, int[] nums, int start, int end) {
      if (end >= start) {
        int mid = (end - start) / 2 + start;
        node.right = new TreeNode(nums[mid]);
        if (end > start) {
          addNodeToLeft(node.right, nums, start, mid - 1);
          addNodeToRight(node.right, nums, mid + 1, end);
        }
      }
    }
  }

  public static void main(String[] args) {
    new MinimumHeightTreeLcci().new Solution().sortedArrayToBST(new int[] {-10, -3, 0, 5, 9});
  }
}

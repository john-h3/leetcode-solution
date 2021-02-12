package easy.depthfirstsearch.minimumheighttreelcci;
/**
 * MinimumHeightTreeLcci
 *
 * @author john 2021/2/12
 */
public class MinimumHeightTreeLcci {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
  class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
      return treefy(nums, 0, nums.length - 1);
    }
    
    private TreeNode treefy(int[] nums, int start, int end) {
      TreeNode root = null;
      if (start <= end) {
        var mid = start + (end - start) / 2;
        root = new TreeNode(nums[mid]);
        root.left = treefy(nums, start, mid - 1);
        root.right = treefy(nums, mid + 1, end);
      }
      return root;
    }
  }
}

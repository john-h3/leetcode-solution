package easy.tree.searchinabinarysearchtree;
/**
 * SearchInABinarySearchTree
 *
 * @author john 2021/1/31
 */
public class SearchInABinarySearchTree {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
  class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
      if (root != null) {
        if (root.val == val) return root;
        TreeNode result = searchBST(root.left, val);
        if (result != null) return result;
        return searchBST(root.left, val);
      }
      return null;
    }
  }
}

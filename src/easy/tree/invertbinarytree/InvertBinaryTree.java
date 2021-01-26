package easy.tree.invertbinarytree;

/**
 * InvertBinaryTree
 *
 * @author john 2021/1/26
 */
public class InvertBinaryTree {
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
    public TreeNode invertTree(TreeNode root) {
      if (root != null) {
        var l = root.left;
        var r = root.right;
        invertTree(l);
        invertTree(r);
        root.left = r;
        root.right = l;
      }
      return root;
    }
  }
}

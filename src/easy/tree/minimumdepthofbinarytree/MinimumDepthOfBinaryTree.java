package easy.tree.minimumdepthofbinarytree;

import java.util.ArrayList;

/**
 * MinimumDepthOfBinaryTree
 *
 * @author john 2021/1/25
 */
public class MinimumDepthOfBinaryTree {
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
    public int minDepth(TreeNode root) {
      if (root == null) return 0;
      var nodes = new ArrayList<TreeNode>();
      nodes.add(root);
      var minHeight = 1;
      while (true) {
        var tmp = new ArrayList<TreeNode>();
        for (TreeNode node : nodes) {
          if (node.left == node.right) return minHeight;
          if (node.left != null) tmp.add(node.left);
          if (node.right != null) tmp.add(node.right);
        }
        nodes = tmp;
        minHeight++;
      }
    }
  }
}

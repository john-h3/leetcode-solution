package easy.tree.lowestcommonancestorofabinarysearchtree;

/**
 * LowestCommonAncestorOfABinarySearchTree
 *
 * @author john 2021/1/26
 */
public class LowestCommonAncestorOfABinarySearchTree {
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if (root == p || root == q) return root;
      if (p.val > q.val) {
        var tmp = p;
        p = q;
        q = tmp;
      }
      if (q.val < root.val) {
        return lowestCommonAncestor(root.left, p, q);
      } else if (p.val > root.val) {
        return lowestCommonAncestor(root.right, p, q);
      } else {
        return root;
      }
    }
  }
}

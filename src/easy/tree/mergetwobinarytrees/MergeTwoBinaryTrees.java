package easy.tree.mergetwobinarytrees;
/**
 * MergeTwoBinaryTrees
 *
 * @author john 2021/1/27
 */
public class MergeTwoBinaryTrees {
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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
      if (t1 != t2) {
        if (t1 == null) t1 = t2;
        else if (t2 != null) {
          t1.val += t2.val;
          t1.left = mergeTrees(t1.left, t2.left);
          t1.right = mergeTrees(t1.right, t2.right);
        }
      }
      return t1;
    }
  }
}

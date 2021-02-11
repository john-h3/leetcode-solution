package easy.depthfirstsearch.leafsimilartrees;
/**
 * LeafSimilarTrees
 *
 * @author john 2021/2/11
 */
public class LeafSimilarTrees {
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
    StringBuilder builder = new StringBuilder();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      LNR(root1);
      var leaf1 = builder.toString();
      builder.delete(0, builder.length());
      LNR(root2);
      return builder.toString().equals(leaf1);
    }

    private void LNR(TreeNode node) {
      if (node != null) {
        if (node.left == node.right) {
          builder.append(node.val);
        } else {
          LNR(node.right);
          LNR(node.left);
        }
      }
    }
  }
}

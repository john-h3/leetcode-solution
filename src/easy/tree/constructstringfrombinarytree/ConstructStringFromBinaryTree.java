package easy.tree.constructstringfrombinarytree;
/**
 * ConstructStringFromBinaryTree
 *
 * @author john 2021/1/27
 */
public class ConstructStringFromBinaryTree {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
  class Solution {
    private StringBuilder builder = new StringBuilder();
    public String tree2str(TreeNode t) {
      if (t == null) return "";
      preOrderIterate(t);
      return builder.substring(1, builder.length() - 1);
    }

    private void preOrderIterate(TreeNode t) {
      if (t != null) {
        builder.append('(').append(t.val);
        preOrderIterate(t.left);
        if (t.left == null && t.right != null) builder.append("()");
        preOrderIterate(t.right);
        builder.append(')');
      }
    }
  }
}

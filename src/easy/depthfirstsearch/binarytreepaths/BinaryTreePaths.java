package easy.depthfirstsearch.binarytreepaths;

import java.util.ArrayList;
import java.util.List;

/**
 * BinaryTreePaths
 *
 * @author john 2021/2/11
 */
public class BinaryTreePaths {
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
    private StringBuilder builder = new StringBuilder();
    private List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
      NLR(root);
      return list;
    }
    
    private void NLR(TreeNode node) {
      if (node != null) {
        builder.append("->");
        builder.append(node.val);
        if (node.left == node.right) {
          list.add(builder.substring(2));
        } else {
          NLR(node.left);
          NLR(node.right);
        }
        builder.delete(builder.lastIndexOf("->"),builder.length());
      }
    }
  }
}

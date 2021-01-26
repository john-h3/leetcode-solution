package easy.tree.binarytreepaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * BinaryTreePaths
 *
 * @author john 2021/1/26
 */
public class BinaryTreePaths {
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
    private List<String> li = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
      recursiveIterate(root, "");
      return li;
    }

    private void recursiveIterate(TreeNode root, String s) {
      if (root != null) {
        s += "->" + root.val;
        if (root.left == root.right) li.add(s.substring(2));
        else {
          recursiveIterate(root.left, s);
          recursiveIterate(root.right, s);
        }
      }
    }
  }
}

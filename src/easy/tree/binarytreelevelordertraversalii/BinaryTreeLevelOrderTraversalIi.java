package easy.tree.binarytreelevelordertraversalii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * BinaryTreeLevelOrderTraversalIi
 *
 * @author john 2021/1/23
 */
public class BinaryTreeLevelOrderTraversalIi {
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      var result = new ArrayList<List<Integer>>();
      iterateTreeNode(result, 0, root);
      Collections.reverse(result);
      return result;
    }

    private void iterateTreeNode(List<List<Integer>> result, int depth, TreeNode root) {
      if (root != null) {
        if (result.size() < depth + 1) {
          result.add(new ArrayList<>());
        }
        var li = result.get(depth);
        li.add(root.val);
        iterateTreeNode(result, depth + 1, root.left);
        iterateTreeNode(result, depth + 1, root.right);
      }
    }
  }
}

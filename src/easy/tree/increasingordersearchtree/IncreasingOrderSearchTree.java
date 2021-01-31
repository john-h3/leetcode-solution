package easy.tree.increasingordersearchtree;

import java.util.ArrayList;
import java.util.List;

/**
 * IncreasingOrderSearchTree
 *
 * @author john 2021/2/1
 */
public class IncreasingOrderSearchTree {
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
    private List<TreeNode> li = new ArrayList<>();
    
    public TreeNode increasingBST(TreeNode root) {
      LNR(root);
      var result = new TreeNode();
      var tmp = result;
      TreeNode prevNode = null;
      for (TreeNode n : li) {
        tmp.val = n.val;
        prevNode = tmp;
        tmp = tmp.right = new TreeNode();
      }
      prevNode.right = null;
      return result;
    }
    
    private void LNR(TreeNode root) {
      if (root != null) {
        LNR(root.left);
        li.add(root);
        LNR(root.right);
      }
    }
  }
}

package easy.tree.leafsimilartrees;

import java.util.ArrayList;
import java.util.List;

/**
 * LeafSimilarTrees
 *
 * @author john 2021/1/31
 */
public class LeafSimilarTrees {
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      var l1 = new ArrayList<TreeNode>();
      LNR(l1, root1);
      var l2 = new ArrayList<TreeNode>();
      LNR(l2, root2);
      return l1.size() == l2.size() && equal(l1, l2);
    }
    
    private void LNR(List<TreeNode> li, TreeNode node) {
      if (node != null) {
        LNR(li, node.left);
        if (node.left == node.right) li.add(node);
        LNR(li, node.right);
      }
    }
    
    private boolean equal(List<TreeNode> l1, List<TreeNode> l2) {
      for (int i = 0; i < l1.size(); i++) {
        if (l1.get(i).val != l2.get(i).val) return false;
      }
      return true;
    }
  }
}

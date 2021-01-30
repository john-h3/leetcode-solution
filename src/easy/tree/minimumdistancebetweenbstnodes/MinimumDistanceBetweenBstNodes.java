package easy.tree.minimumdistancebetweenbstnodes;

import java.util.ArrayList;
import java.util.List;

/**
 * MinimumDistanceBetweenBstNodes
 *
 * @author john 2021/1/31
 */
public class MinimumDistanceBetweenBstNodes {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  class Solution {
    List<TreeNode> nodes = new ArrayList<>();

    public int minDiffInBST(TreeNode root) {
      LNR(root);
      var min = nodes.get(1).val-nodes.get(0).val;
      for (int i = 2; i < nodes.size(); i++) {
        min = Math.min(min, nodes.get(i).val - nodes.get(i - 1).val);
      }
      return min;
    }
    
    private void LNR(TreeNode root) {
      if (root != null) {
        LNR(root.left);
        nodes.add(root);
        LNR(root.right);
      }
    }
  }
}

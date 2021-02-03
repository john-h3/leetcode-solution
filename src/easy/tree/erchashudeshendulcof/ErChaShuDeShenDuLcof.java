package easy.tree.erchashudeshendulcof;

import java.util.ArrayList;

/**
 * ErChaShuDeShenDuLcof
 *
 * @author john 2021/2/3
 */
public class ErChaShuDeShenDuLcof {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
  class Solution {
    public int maxDepth(TreeNode root) {
      return NLR(root);
    }
    
    private int NLR(TreeNode node) {
      if (node != null) {
        return 1 + Math.max(NLR(node.left), NLR(node.right));
      }
      return 0;
    }
  }
}
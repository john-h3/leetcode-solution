package easy.tree.erchashudezuijingonggongzuxianlcof;

import java.util.ArrayList;
import java.util.List;

/**
 * ErChaShuDeZuiJinGongGongZuXianLcof
 *
 * @author john 2021/2/4
 */
public class ErChaShuDeZuiJinGongGongZuXianLcof {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
  class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if (p.val == root.val || q.val == root.val) return root;
      var p1 = new ArrayList<TreeNode>();
      var p2 = new ArrayList<TreeNode>();
      NLR(root, p.val, p1);
      NLR(root, q.val, p2);
      var result = root;
      for (int i = 0; i < Math.min(p1.size(), p2.size()); i++) {
        if (p1.get(i) == p2.get(i)) result = p1.get(i);
        else break;
      }
      return result;
    }

    private boolean NLR(TreeNode n, int v, List<TreeNode> parentChain) {
      if (n != null) {
        parentChain.add(n);
        if (n.val != v) {
          boolean b = NLR(n.left, v, parentChain);
          if (!b) {
            b = NLR(n.right, v, parentChain);
            if (!b) {
              parentChain.remove(parentChain.size() - 1);
            } else return true;
          } else {
            return true;
          }
        } else return true;
      }
      return false;
    }
  }
}
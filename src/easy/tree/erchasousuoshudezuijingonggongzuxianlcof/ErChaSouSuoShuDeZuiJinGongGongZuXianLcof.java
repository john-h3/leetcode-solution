package easy.tree.erchasousuoshudezuijingonggongzuxianlcof;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ErChaSouSuoShuDeZuiJinGongGongZuXianLcof
 *
 * @author john 2021/2/4
 */
public class ErChaSouSuoShuDeZuiJinGongGongZuXianLcof {
  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
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

  public static void main(String[] args) {
    var root = new TreeNode(6);
    var p = new TreeNode(2);
    var q = new TreeNode(5);
    root.left = p;
    p.left = new TreeNode(0);
    p.right = new TreeNode(4);
    p.right.left = new TreeNode(3);
    p.right.right = q;

    new ErChaSouSuoShuDeZuiJinGongGongZuXianLcof().new Solution().lowestCommonAncestor(root, p, q);
  }
}

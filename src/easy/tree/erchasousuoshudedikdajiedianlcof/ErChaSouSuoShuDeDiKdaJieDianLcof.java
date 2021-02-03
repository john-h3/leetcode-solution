package easy.tree.erchasousuoshudedikdajiedianlcof;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * ErChaSouSuoShuDeDiKdaJieDianLcof
 *
 * @author john 2021/2/3
 */
public class ErChaSouSuoShuDeDiKdaJieDianLcof {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
  class Solution {
    private List<Integer> li = new ArrayList<>();

    public int kthLargest(TreeNode root, int k) {
      assert root != null;
      RNL(root);
      return li.get(k-1);
    }
    
    private void RNL(TreeNode node) {
      if (node != null) {
        RNL(node.right);
        li.add(node.val);
        RNL(node.left);
      }
    }
  }
}

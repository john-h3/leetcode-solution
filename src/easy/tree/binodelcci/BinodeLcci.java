package easy.tree.binodelcci;

/**
 * BinodeLcci
 *
 * @author john 2021/2/5
 */
public class BinodeLcci {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
  class Solution {
    TreeNode head;
    TreeNode preNode;
    public TreeNode convertBiNode(TreeNode root) {
      LNR(root);
      return head;
    }
    
    private void LNR(TreeNode node) {
      if (node != null) {
        LNR(node.left);
        node.left = null;
        if (head == null) head = preNode = node;
        else preNode = preNode.right = node;
        LNR(node.right);
      }
    }
  }
}
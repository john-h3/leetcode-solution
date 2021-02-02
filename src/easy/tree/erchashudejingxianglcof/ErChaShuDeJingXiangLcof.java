package easy.tree.erchashudejingxianglcof;

/**
 * ErChaShuDeJingXiangLcof
 *
 * @author john 2021/2/2
 */
public class ErChaShuDeJingXiangLcof {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
  class Solution {
    public TreeNode mirrorTree(TreeNode root) {
      LRN(root);
      return root;
    }
    
    private void LRN(TreeNode n) {
      if (n != null) {
        LRN(n.left);
        LRN(n.right);
        var tmp = n.left;
        n.left = n.right;
        n.right = tmp;
      }
    }
  }
}
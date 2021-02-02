package easy.tree.sumofroottoleafbinarynumbers;

/**
 * SumOfRootToLeafBinaryNumbers
 *
 * @author john 2021/2/2
 */
public class SumOfRootToLeafBinaryNumbers {
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
    private int sum;
    public int sumRootToLeaf(TreeNode root) {
      LNR(root, 0);
      return sum;
    }
    
    private void LNR(TreeNode n, int base) {
      if (n != null) {
        int newV = (base << 1) + n.val;
        LNR(n.left, newV);
        if (n.left == n.right) sum += newV;
        LNR(n.right, newV);
      }
    }
  }
}
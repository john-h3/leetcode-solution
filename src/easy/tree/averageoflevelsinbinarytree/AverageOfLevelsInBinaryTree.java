package easy.tree.averageoflevelsinbinarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * AverageOfLevelsInBinaryTree
 *
 * @author john 2021/1/30
 */
public class AverageOfLevelsInBinaryTree {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  class Solution {
    private List<Double> result = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
      var li = new ArrayList<TreeNode>();
      li.add(root);
      while (!li.isEmpty()) {
        average(li);
        var tmp = new ArrayList<TreeNode>();
        li.forEach(
            e -> {
              if (e.left != null) tmp.add(e.left);
              if (e.right != null) tmp.add(e.right);
            });
        li = tmp;
      }
      return result;
    }

    private void average(List<TreeNode> nodes) {
      result.add(nodes.stream().mapToLong(e -> e.val).sum() / (nodes.size() * 1d));
    }
  }
}

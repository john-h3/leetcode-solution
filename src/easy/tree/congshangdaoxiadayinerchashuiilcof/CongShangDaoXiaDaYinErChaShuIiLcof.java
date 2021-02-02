package easy.tree.congshangdaoxiadayinerchashuiilcof;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * CongShangDaoXiaDaYinErChaShuIiLcof
 *
 * @author john 2021/2/3
 */
public class CongShangDaoXiaDaYinErChaShuIiLcof {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      var result = new ArrayList<List<Integer>>();
      List<TreeNode> level = new ArrayList<>();
      if (root != null) level.add(root);
      while (!level.isEmpty()) {
        var li = new ArrayList<Integer>();
        level.forEach(e -> li.add(e.val));
        result.add(li);
        var size = level.size();
        for (int i = 0; i < size; i++) {
          var n = level.get(i);
          if (n.left != null) level.add(n.left);
          if (n.right != null) level.add(n.right);
        }
        level = level.subList(size, level.size());
      }
      return result;
    }
  }
}

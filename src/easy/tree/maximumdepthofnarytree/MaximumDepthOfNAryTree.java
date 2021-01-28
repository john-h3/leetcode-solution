package easy.tree.maximumdepthofnarytree;

import java.util.List;

/**
 * MaximumDepthOfNAryTree
 *
 * @author john 2021/1/28
 */
public class MaximumDepthOfNAryTree {
  class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  }
  ;

  class Solution {
    public int maxDepth(Node root) {
      if (root == null) return 0;
      else return 1 + root.children.stream().mapToInt(this::maxDepth).max().orElse(0);
    }
  }
}

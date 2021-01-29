package easy.tree.narytreepreordertraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * NAryTreePreorderTraversal
 *
 * @author john 2021/1/29
 */
public class NAryTreePreorderTraversal {
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
  };

  class Solution {
    private List<Integer> result = new ArrayList<>();
    
    public List<Integer> preorder(Node root) {
      preOrderIterate(root);
      return result;
    }
    
    private void preOrderIterate(Node root) {
      if (root != null) {
        result.add(root.val);
        root.children.forEach(this::preOrderIterate);
      }
    }
  }
}
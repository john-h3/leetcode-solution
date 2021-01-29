package easy.tree.narytreepostordertraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * NAryTreePostorderTraversal
 *
 * @author john 2021/1/29
 */
public class NAryTreePostorderTraversal {
  static class Node {
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

  class Solution {
    public List<Integer> postorder(Node root) {
      var stack = new Stack<Node>();
      var result = new ArrayList<Integer>();
      stack.add(root);
      while (!stack.isEmpty()) {
        root = stack.pop();
        if (root != null) {
          if (!root.children.isEmpty()) {
            stack.push(root);
            for (int i = root.children.size() - 1; i >= 0; i--) {
              stack.push(root.children.get(i));
            }
            root.children = Collections.emptyList();
          } else {
            result.add(root.val);
          }
        }
      }
      return result;
    }
  }
}

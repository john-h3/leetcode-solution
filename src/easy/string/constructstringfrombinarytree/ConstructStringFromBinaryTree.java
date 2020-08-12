package easy.string.constructstringfrombinarytree;

/**
 * ConstructStringFromBinaryTree
 *
 * @author john 2020/8/12
 */
public class ConstructStringFromBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public String tree2str(TreeNode t) {
            if (t == null) {
                return "";
            }
            StringBuilder builder = new StringBuilder();
            recursive(builder, t);
            return builder.toString();
        }

        private void recursive(StringBuilder builder, TreeNode node) {
            builder.append(node.val);
            if (node.left == null && node.right != null) {
                builder.append('(').append(')');
            }  else if (node.left != null) {
                builder.append('(');
                recursive(builder, node.left);
                builder.append(')');
            }
            if (node.right != null) {
                builder.append('(');
                recursive(builder, node.right);
                builder.append(')');
            }
        }
    }
}
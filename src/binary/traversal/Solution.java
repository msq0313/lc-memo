package binary.traversal;

import binary.TreeNode;

import java.util.Stack;

public class Solution {
    public void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                System.out.println(current.val);
                current = current.left;
            }
            current = stack.pop();
            current = current.right;
        }
    }

    public void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.println(current.val);
            current = current.right;
        }
    }

    public void postorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
            stack2.push(node);
        }
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop().val);
        }
    }

    public void inorderTraversalRecursion(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversalRecursion(root.left);
        System.out.println(root.val);
        inorderTraversalRecursion(root.right);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1, null, null);
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node5 = new TreeNode(5, null, null);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        Solution solution = new Solution();
//        solution.inorderTraversalRecursion(node1);
//        solution.inorderTraversal(node1);
//        solution.preorderTraversal(node1);
        solution.postorderTraversal(node1);
    }
}

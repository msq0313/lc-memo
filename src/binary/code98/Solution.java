package binary.code98;

import binary.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        traversal(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(root.left);
        list.add(root.val);
        traversal(root.right);
    }

    public boolean isValidBST2(TreeNode root) {
        if (root == null) {
            return false;
        }
        Stack<TreeNode> stack = new Stack<>();
        int pre = 0;
        boolean flag = false;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            if (flag && node.val <= pre) {
                return false;
            }
            pre = node.val;
            if (!flag) {
                flag = true;
            }
            if (node.right != null) {
                root = node.right;
            }
        }
        return true;
    }

    public boolean isValidBST3(TreeNode root) {
        return isValidBST3Helper(root, null, null);
    }

    // 需要满足  min.val < root.val < max.val
    public boolean isValidBST3Helper(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.val <= min.val) {
            return false;
        }
        if (max != null && root.val >= max.val) {
            return false;
        }
        return isValidBST3Helper(root.left, min, root) &&
                isValidBST3Helper(root.right, root, max);
    }
}

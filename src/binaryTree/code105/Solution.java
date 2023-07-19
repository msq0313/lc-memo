package binaryTree.code105;

import binaryTree.TreeNode;

import java.util.HashMap;

public class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree2(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }
    public TreeNode buildTree2(int[] preorder, int preLeft, int preRight,
                               int[] inorder, int inLeft, int inRight) {
        if (preLeft >= preRight) {
            return null;
        }
        int val = preorder[preLeft];
        int index = map.get(val);
        return new TreeNode(val,
                buildTree2(preorder, preLeft + 1, preLeft + 1 + index - inLeft,
                        inorder, inLeft, inLeft + index - inLeft ),
                buildTree2(preorder, preLeft + 1 + index - inLeft, preRight,
                        inorder, index + 1, inRight));
    }

    public static void main(String[] args) {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        TreeNode res = new Solution().buildTree(preorder, inorder);

    }
}

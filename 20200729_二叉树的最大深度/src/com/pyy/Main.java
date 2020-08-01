package com.pyy;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 * [3,9,20,null,null,15,7]
 */
public class Main {

    public static void main(String[] args) {
        // 初始化tree
        TreeNode root = initTree();
        // 添加元素
        TreeNode treeNode = addTreeNode(root);
        // 计算深度
        int depth = maxDepth(treeNode);
        System.out.println("depth: "+depth);


    }

    // 初始化根节点为 3 的Tree
    public static TreeNode initTree() {
        TreeNode root;
        if ((root = new TreeNode(3)) != null) {
            root.left = null;
            root.right = null;
            if (root != null) {
                return root;
            } else {
                return null;
            }
        }
        return null;
    }

    public static TreeNode addTreeNode(TreeNode root) {
        // [3,9,20,null,null,15,7]
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        return root;
    }

    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

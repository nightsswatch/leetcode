package com.arthur.leetcode;

import java.util.ArrayList;

/**
 * @title: No897
 * @Author ArthurJi
 * @Date: 2021/4/25 10:20
 * @Version 1.0
 */
public class No897 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    ArrayList<TreeNode> list = new ArrayList<TreeNode>();
    TreeNode NewHead = new TreeNode();
    TreeNode head = NewHead;
    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        head.right = null;
        head.left = null;
        return NewHead.right;
    }

    private void dfs(TreeNode root) {
        if(root == null) {
            return;
        }
        dfs(root.left);
        list.add(root);
        head.right = root;
        head.left = null;
        head = head.right;
        dfs(root.right);
    }
}
/*897. 递增顺序搜索树
        给你一棵二叉搜索树，请你 按中序遍历 将其重新排列为一棵递增顺序搜索树，使树中最左边的节点成为树的根节点，并且每个节点没有左子节点，只有一个右子节点。



        示例 1：


        输入：root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
        输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
        示例 2：


        输入：root = [5,1,7]
        输出：[1,null,5,null,7]*/

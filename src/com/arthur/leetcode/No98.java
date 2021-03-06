package com.arthur.leetcode;

/**
 * @title: No98
 * @Author ArthurJi
 * @Date: 2021/3/8 10:51
 * @Version 1.0
 */
public class No98 {

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

    public static void main(String[] args) {

    }

    int pre;
    boolean flag = false;
    boolean first = false;

    public boolean isValidBST(TreeNode root) {
//        TreeNode preNode = root;
//        while (preNode.left != null) {
//            preNode = preNode.left;
//        }
//        pre = preNode.val;
        mid(root);
        return !flag;
    }

    private void mid(TreeNode root) {
        if (flag) {
            return;
        }
        if (root == null) {
            return;
        }
        if(root.left == null && !first) {
            pre = root.val;
        }
        mid(root.left);
        if (pre >= root.val) {
            if(first) {
                flag = true;
                return;
            } else {
                first = true;
            }
        }
        pre = root.val;
        mid(root.right);
    }
}

/*98. 验证二叉搜索树
        给定一个二叉树，判断其是否是一个有效的二叉搜索树。

        假设一个二叉搜索树具有如下特征：

        节点的左子树只包含小于当前节点的数。
        节点的右子树只包含大于当前节点的数。
        所有左子树和右子树自身必须也是二叉搜索树。
        示例 1:

        输入:
        2
        / \
        1   3
        输出: true
        示例 2:

        输入:
        5
        / \
        1   4
        / \
        3   6
        输出: false
        解释: 输入为: [5,1,4,null,null,3,6]。
        根节点的值为 5 ，但是其右子节点值为 4 。*/

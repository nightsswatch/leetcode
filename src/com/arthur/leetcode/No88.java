package com.arthur.leetcode;

/**
 * @title: No88
 * @Author ArthurJi
 * @Date: 2021/4/1 15:05
 * @Version 1.0
 */
public class No88 {
    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length;
        m--;
        n--;
        for (int i = index - 1; i >= 0; i--) {
            if(m < 0) {
                nums1[i] = nums2[n];
                n--;
            } else if(n < 0) {
                nums1[i] = nums1[m];
                m--;
            } else if(nums1[m] > nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
        }
    }

}
/*
88. 合并两个有序数组
        给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。

        初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。



        示例 1：

        输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        输出：[1,2,2,3,5,6]
        示例 2：

        输入：nums1 = [1], m = 1, nums2 = [], n = 0
        输出：[1]*/

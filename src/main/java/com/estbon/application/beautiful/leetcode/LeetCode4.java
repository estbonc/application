package com.estbon.application.beautiful.leetcode;

/**
 * @author liushuaishuai
 * @date 2019/10/15 15:18
 * <p>
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode4 {
    public static void main(String[] args) {

        LeetCode4 leetCode4 = new LeetCode4();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 5, 8};
        double medianSortedArrays = leetCode4.findMedianSortedArrays(arr1, arr2);
        System.out.println(medianSortedArrays);
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        return 1.0;
    }

}

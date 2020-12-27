package com.pyy;

public class Test {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        Solution solution = new Solution();
        int[] nextGreaterElement = solution.nextGreaterElement(nums1, nums2);
        String s = nextGreaterElement.toString();
        System.out.println(s);
    }
}

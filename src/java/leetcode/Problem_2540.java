package leetcode;
import  java.util.*;
public class Problem_2540 {
    public static void main(String[] args) {
        int[] nums1={2,4};
        int[] nums2={1,2};

        System.out.println(getCommon(nums1,nums2));
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        if(nums1.length==0||nums2.length==0)return -1;
        int i=0;
        int j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]) return nums1[i];
            if(nums1[i]<nums2[j])i++;
            else j++;

        }
        return -1;
    }

}

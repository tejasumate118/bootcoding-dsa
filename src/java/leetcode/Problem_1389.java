package leetcode;

import java.util.LinkedList;

public class Problem_1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n= nums.length;
        LinkedList<Integer> list=new LinkedList<Integer>();
        for(int i=0;i<n;i++) list.add(index[i],nums[i]);




        //result arr
        int[] arr=new int[n];
        int k=0;
        for(Integer num: list){
            arr[k++]=num;


        }
        return arr;

    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};int[] index = {0,1,2,2,1};
        int[] res=createTargetArray(nums,index);
        for(int i:res){
            System.out.print(i+", ");
        }
    }
}

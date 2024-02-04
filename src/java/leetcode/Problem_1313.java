package leetcode;

import java.util.ArrayList;

public class Problem_1313 {
    public static int[] decompressRLElist(int[] nums) {
        int n= nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i+=2){
            int freq=nums[i];
            int val=nums[i+1];
            for(int j=1;j<=freq;j++){
                list.add(val);

            }
        }
        int[] res=new int[list.size()];
        int k=0;
        for(int num: list){
            res[k++]=num;
        }



        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result =decompressRLElist(nums);
        for(int num: result){
            System.out.print(num+", ");
        }
    }
}

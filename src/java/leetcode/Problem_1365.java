package leetcode;

import java.util.Arrays;

public class Problem_1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp=new int[nums.length];
        int temppointer=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(i==j)continue;
                else if (nums[j] < nums[i]) {
                    count++;
                    
                }

            }
            temp[temppointer++]=count;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int[] res=smallerNumbersThanCurrent(nums);
        for(int n: res){
            System.out.print(n+", ");
        }
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem_2859 {

        public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
            int sum=0;
            for(int i=0;i<nums.size();i++){
                if(countbits(i)==k){
                    sum+=nums.get(i);
                }
            }return sum;

        }
        public static int countbits(int num){
            int count=0;
            String bit=Integer.toBinaryString(num);
            for(int i=0;i<bit.length();i++){
                if(bit.charAt(i)=='1') count++;
            }
            return count;


        }

    public static void main(String[] args) {
            int[] arr={5,10,1,5,2};
        List<Integer> list=new ArrayList<>();
        for(int a:arr){
            list.add(a);
        }
        System.out.println(sumIndicesWithKSetBits(list,1));


    }
}

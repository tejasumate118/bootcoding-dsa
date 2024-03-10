package leetcode;
import java.util.*;

public class Problem_349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int arr[]=intersection(nums1,nums2);
        for(int ele:arr){
            System.out.print(ele+", ");
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s=new HashSet<>();
        for(int ele: nums1){
            s.add(ele);
        }
        HashSet<Integer> res=new HashSet<>();
        for(int ele: nums2){
            if(s.contains(ele)){
                res.add(ele);
                s.remove(ele);
            }
        }
        int[] arr=new int[res.size()];
        int i=0;
        for(int ele:res){
            arr[i++]=ele;
        }
        return arr;
    }
}

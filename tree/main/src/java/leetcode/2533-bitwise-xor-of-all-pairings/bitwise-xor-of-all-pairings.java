class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x1=0;
        int x2 =0;
        int ans=0;
        for(int num:nums1){
            x1 ^= num;
        }
        for(int num:nums2){
            x2^=num;
        }
        if(nums1.length%2 !=0){
            ans^=x2;
        }
        if(nums2.length%2 !=0){
            ans^=x1;
        }
        return ans;
        
    }
}
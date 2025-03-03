class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int l=0;
        int r=nums.length-1;
        for(int i=0,j =nums.length-1;i<nums.length;i++,j--){
            if(nums[j]>pivot) res[r--]=nums[j];
            if(nums[i]<pivot) res[l++]=nums[i];
        }
        while(l<=r) res[l++]=pivot;
        return res;
        
    }
}
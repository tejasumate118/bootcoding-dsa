class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k!=0){
            //Find min
            int min_idx=0;
            for(int i=0;i<nums.length;i++){
                min_idx = nums[i]<nums[min_idx]?i:min_idx;
            }
            nums[min_idx]*=multiplier;
            k--;
        }
        return nums;
    }
}
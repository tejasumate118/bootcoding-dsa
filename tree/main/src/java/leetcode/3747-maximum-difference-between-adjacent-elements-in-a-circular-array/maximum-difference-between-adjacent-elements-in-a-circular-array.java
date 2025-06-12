class Solution {
    int max = Integer.MIN_VALUE;
    public int maxAdjacentDistance(int[] nums) {
        for(int i = 0 ;i < nums.length-1 ; i++){
            int diff = Math.abs(nums[i] - nums[i +1]);
            max = diff > max ? diff : max;
        }
        max = Math.max(Math.abs(nums[0]-nums[nums.length-1]),max);
        return max;
    }
}
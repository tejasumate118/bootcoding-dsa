class Solution {
    public int waysToSplitArray(int[] nums) {
        
        
        long sum = 0;
        for(int num:nums) sum += num;
        int i = 0;
        int count = 0;
        long left = 0;
        while ( i < nums.length-1){
            left+= nums[i];
            long r = sum - left;
            if(left>=r) count++;
            i++;
        }
        return count;

        
    }
}
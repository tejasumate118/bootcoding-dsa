class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int nextUnique=0;
        int ans=0;
        for(int num: nums){
            nextUnique = nextUnique > num ? nextUnique : num;
            ans += nextUnique - num;
            nextUnique++;
        }
        return ans;
    }
}
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefixsum=0,ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixsum=(prefixsum+nums[i]%k+k)%k;
            ans+=map.getOrDefault(prefixsum,0);
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return ans;
    }
}
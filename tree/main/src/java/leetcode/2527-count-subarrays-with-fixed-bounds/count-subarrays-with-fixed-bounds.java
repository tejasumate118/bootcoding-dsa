class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int maxi=-1,mini=-1,badi=-1,n=nums.length;
        long ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]<minK||nums[i]>maxK) badi=i;
            if(nums[i]==maxK)maxi=i;
            if(nums[i]==minK)mini=i;
            ans+=Math.max(0,Math.min(maxi,mini)-badi);
        }

        return ans;
    }
}
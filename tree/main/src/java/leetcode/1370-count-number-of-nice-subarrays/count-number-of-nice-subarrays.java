class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans=0;
        int oddCount=0;
        int[] prefixCount=new int[nums.length+1];
        prefixCount[0]=1;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num%2!=0){
                oddCount++;
            }
            
            if(oddCount>=k){
                ans+=prefixCount[oddCount-k];
            }
            prefixCount[oddCount]++;
            
            
        }
        return ans;
        
    }
}
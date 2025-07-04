class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> dp = new HashMap<>();
        //Number , Index
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        int maxConsecutiveSeqLen = 0;
        //fetch from dp instead of cal again
        for(int num : nums){
            maxConsecutiveSeqLen = Math.max(maxConsecutiveSeqLen, getLength(num , dp , hs));
        }
        return maxConsecutiveSeqLen;
        
    }
    private int getLength(int num, Map<Integer,Integer> dp , Set<Integer> numSet){
        if(!numSet.contains(num)) return 0;
        if(dp.containsKey(num)) return dp.get(num);
        int length = 1+ getLength(num+1,dp,numSet);
        dp.put(num,length);
        return length;
    }
}
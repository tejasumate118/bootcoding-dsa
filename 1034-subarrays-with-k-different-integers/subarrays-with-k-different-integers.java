

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1);
    }
    
    private int atMostKDistinct(int[] nums, int k) {
        int count = 0;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            map.put(num, map.getOrDefault(num, 0) + 1);
            
            while (map.size() > k) {
                int leftNum = nums[left++];
                map.put(leftNum, map.get(leftNum) - 1);
                if (map.get(leftNum) == 0) {
                    map.remove(leftNum);
                }
            }
            
            count += right - left + 1;
        }
        
        return count;
    }
}

class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4)return 0;
        return minDifPQ(nums);

    }
    private int minDifPQ(int[] nums){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            minHeap.add(num);
            maxHeap.add(num);
            if(minHeap.size()>4) minHeap.poll();
            if(maxHeap.size()>4) maxHeap.poll();
        }

        int i=3, j=nums.length-4;
        while(!minHeap.isEmpty()){
            nums[i--]=maxHeap.poll();
            nums[j++]=minHeap.poll();
        }
        return minDiff(nums);
    }
    private int minDiff(int[] op){
        int n=op.length;
        int min;
        min=op[n-4]-op[0];
        min=Math.min(op[n-3]-op[1],min);
        min=Math.min(op[n-2]-op[2],min);
        return Math.min(op[n-1]-op[3],min);
    }
}
class Solution {
    public int heightChecker(int[] heights) {
        int[] bucket=createBucket(heights);
        int outOfOrder=0;
        int nextInHeight=0;

        for(int i=0; i<heights.length; i++){
            nextInHeight=nextHeight(nextInHeight,bucket);
            if(heights[i]!=nextInHeight) outOfOrder++;

            bucket[nextInHeight]--;
        }
        return outOfOrder;
        
    }

    private int nextHeight(int currentHeight,int arr[]){
        while(arr[currentHeight]==0)
            currentHeight++; 
        return currentHeight;
    }
    private int[] createBucket(int arr[]){
        int[] bucket=new int[101];
        for(int num:arr) bucket[num]++;
        
        return bucket;

    }
}
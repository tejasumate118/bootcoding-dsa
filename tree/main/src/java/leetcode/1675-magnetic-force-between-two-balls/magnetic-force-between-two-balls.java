class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1; //Can also be 1 cause each ball is placed in unique buckets.
        int r= position[position.length-1];
        int ans = -1;
        while(l<=r){
            int mid= (l+r)/2;
            if(isValidDist(mid, position, m)){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
    private boolean isValidDist(int mid,int[] position, int m ){
        int countOfBallsPlaced=1, prevId=0;
        
        for(int i=1; i< position.length;i++){
            if(position[i]-position[prevId]>=mid){
                countOfBallsPlaced++;
                prevId=i;
            }
        }
        return countOfBallsPlaced>=m;
    }
}
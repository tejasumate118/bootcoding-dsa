class Solution {
    public long coloredCells(int n) {
        long res=0;
        long curr =0;
        for(int i = 1;i<n;i++) {
            curr+=4;
            res+=curr;
        }
        return res+1;
        
    }
}
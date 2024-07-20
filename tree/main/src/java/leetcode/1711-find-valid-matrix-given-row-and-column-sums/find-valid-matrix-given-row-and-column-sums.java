class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int [][] ans=new int [rowSum.length][colSum.length];
        int row=0;
        int col=0;
        while(row<rowSum.length && col<colSum.length){
            int reduce=Math.min(rowSum[row],colSum[col]);
            ans[row][col]=reduce;
            rowSum[row]-=reduce;
            colSum[col]-=reduce;
            if(rowSum[row]==0) row++;
            if(colSum[col]==0) col++;
        }
        return ans;
    }
}
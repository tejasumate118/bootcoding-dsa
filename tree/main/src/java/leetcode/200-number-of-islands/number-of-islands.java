class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length, n= m!=0? grid[0].length: 0,islands=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    islands++;
                    dfs(grid,i,j);
                }

            }
        }
        return islands;
    }
    void dfs(char[][] grid, int i,int j){
        int m=grid.length, n= m!=0? grid[0].length: 0;
        if(i<0 || i==m || j<0 || j==n || grid[i][j]=='0') return;
        grid[i][j]='0';
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);


        
    }
}
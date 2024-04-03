class Solution {
    private boolean[][] visited;
    private char[][] board;
    private String word;
    int ROWS;
    int COLS;
    public boolean exist(char[][] board, String word) {
        this.board=board;
        this.word=word;
        ROWS=board.length;
        COLS=board[0].length;
        visited=new boolean[ROWS][COLS];
        //find first char
        for(int r=0;r<ROWS;r++){
            for(int c=0;c<COLS;c++){
                if((word.charAt(0)==board[r][c])&&isValidString(r,c,0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean isValidString(int r,int c,int idx){
        if(idx==word.length())return true;
        char ch=word.charAt(idx);
        if(r<0||r>=ROWS||c<0||c>=COLS||board[r][c]!=ch||visited[r][c]) return false;
        
        visited[r][c]=true;
        
        if((isValidString(r,c-1,idx+1)||isValidString(r,c+1,idx+1)||isValidString(r-1,c,idx+1)||isValidString(r+1,c,idx+1))){
            return true;
        }
        visited[r][c]=false;
        return false;
    }
}

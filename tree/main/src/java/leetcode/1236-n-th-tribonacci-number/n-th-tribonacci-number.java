class Solution {
    //HashMap <Integer, Integer> memo =new HashMap<>();
    int[] memo;
    public int tribonacci(int n) {
       memo=new int[n+1];
       return helper(n);
    }
    int helper(int n){
        if(n==0)return 0;
        if(n==1 || n==2)return 1;
        if(memo[n]!=0) return memo[n];
        memo[n]=helper(n-1)+helper(n-2)+helper(n-3);
        return memo[n];
    }
}
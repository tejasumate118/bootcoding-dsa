class Solution {
    public int maxScore(String s) {
        //Intial calculation 
        int left = s.charAt(0)=='0'? 1:0;
        int right = 0;
        for(int i=1 ; i<s.length();i++){
            right = s.charAt(i)=='1'? right+1:right;
        }
        int res = left + right;
        for(int i = 1; i<s.length()-1; i++){
            if(s.charAt(i)=='0'){
                left++;
            }else{
                right--;
            }
            res= Math.max(res,left+right);

        }
        return res;
        
    }
}
class Solution {
    public int scoreOfString(String s) {
        int res=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            int val1=(int) arr[i];
            int val2=(int) arr[i+1];
            res+=Math.abs(val1-val2);
        }
        return res;
    }
}
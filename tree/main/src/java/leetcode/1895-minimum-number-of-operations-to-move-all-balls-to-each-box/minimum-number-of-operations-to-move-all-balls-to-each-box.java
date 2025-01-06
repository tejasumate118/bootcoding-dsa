class Solution {
    public int[] minOperations(String boxes) {
        int cnt1 =0;
        int prefixsum=0;
        int suffixsum=0;
        int[] minops= new int[boxes.length()];
        for(int i=boxes.length()-1; i>=0; i--){
            suffixsum += cnt1;
            minops[i]= suffixsum;
            cnt1= boxes.charAt(i)=='1'? cnt1+1:cnt1;
        }
        
        cnt1=0;
        for(int i=0;i<boxes.length();i++){
            prefixsum += cnt1;
            minops[i]= minops[i] + prefixsum;
            cnt1= boxes.charAt(i)=='1'? cnt1+1:cnt1;

        }
        return minops;
    }
}
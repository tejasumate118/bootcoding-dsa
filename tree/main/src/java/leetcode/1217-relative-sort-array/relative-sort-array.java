class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int i=0;
        int[] freq= new int[1001];
        int[] res= new int[arr1.length];
        for(int num : arr1) freq[num]++;

        for(int num:arr2){
            if (freq[num] > 0) {
                Arrays.fill(res,i,i+freq[num],num);
                i+=freq[num];
                freq[num] = 0; 
            }
        }
        for(int j=0 ; j < 1001 ; j++){
            if(freq[j]!=0){
                Arrays.fill(res,i,i+freq[j],j);
                i+=freq[j];
            }
        }
        return res;

    }
}
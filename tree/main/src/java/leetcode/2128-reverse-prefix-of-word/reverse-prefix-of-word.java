class Solution {
    public String reversePrefix(String word, char ch) {
        //To Character Array
        char[] arr= word.toCharArray();
        //Finding First Occurance of ch.
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                idx=i;
                break;
            }
        }
        //Left and Right Pointers to traverse and Swap substring.
        int left=0;
        int right=idx;
        while(left<right){
            char temp= arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        //Return The result (here arr)
        return new String(arr);
    }
}
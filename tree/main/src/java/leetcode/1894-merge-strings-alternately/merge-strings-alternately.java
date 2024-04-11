class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb= new StringBuilder();
        int word1len=word1.length();
        int word2len=word2.length();
        int n= word1len>word2len? word1len : word2len;
        for(int i=0;i<n;i++){
            if(i<word1len){
                sb.append(word1.charAt(i));
            }
            if(i<word2len){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
        
    }
}
class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        while(sb.length()< k){
            sb.append(appendString(sb.toString()));
        }
        return sb.charAt(k-1);
        
    }
    private StringBuilder appendString(String str){
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            sb.append(nextChar(ch));
        }
        return sb;
    }
    private char nextChar(char ch){
        return (char) ('a' + (ch - 'a' + 1) % 26);
    }

}
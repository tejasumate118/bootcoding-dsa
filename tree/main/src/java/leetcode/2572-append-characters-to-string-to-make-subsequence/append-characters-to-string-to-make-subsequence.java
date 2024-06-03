class Solution {
    public int appendCharacters(String s, String t) {
    
        int ptr=-1;
        for(char ch:s.toCharArray()){
            if(ptr<t.length()-1 && (ch==t.charAt(ptr+1))){
                ptr++;
            }
        }
        return t.length()-ptr-1;
    }
}
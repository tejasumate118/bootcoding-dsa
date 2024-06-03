class Solution {
    public int appendCharacters(String s, String t) {
        int lent=t.length();
        int ptr=-1;
        for(char ch:s.toCharArray()){
            if(ptr<lent-1 && (ch==t.charAt(ptr+1))){
                ptr++;
            }
        }
        return lent-ptr-1;
    }
}
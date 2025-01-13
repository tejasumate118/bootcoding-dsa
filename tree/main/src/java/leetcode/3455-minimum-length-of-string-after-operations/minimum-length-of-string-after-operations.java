class Solution {
    public int minimumLength(String s) {
        int countLeft[]=new int[26];
        int countRight[]=new int[26];
        for(int i=0;i<s.length();i++){
            countRight[s.charAt(i)-'a']++;
        }
        int res=s.length();
        for(int i=0;i<s.length();i++){
            countRight[s.charAt(i)-'a']--;
            if(countLeft[s.charAt(i)-'a']>0 && countRight[s.charAt(i)-'a']>0){
                countLeft[s.charAt(i)-'a']--;
                countRight[s.charAt(i)-'a']--;
                res-=2;
            }
            countLeft[s.charAt(i)-'a']++;
        }
        return res;
    }
}
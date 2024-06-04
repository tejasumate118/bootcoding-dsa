class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        boolean extra = false;
        //Map populating
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        } 
        int res=0;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            int ans=entry.getValue()/2;
            res+=ans*2;
            if(!extra && (entry.getValue()%2 != 0)){
                res++;
                extra=true;
            }
        }
        map.clear();
        return res;
    }
}
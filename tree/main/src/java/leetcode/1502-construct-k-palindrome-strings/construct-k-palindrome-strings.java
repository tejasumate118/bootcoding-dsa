class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()==k) return true;
        if(s.length()<k) return false;
    
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch: s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);

        }
        int oddcnt=0;
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            if(entry.getValue()%2 == 1) oddcnt++;
        }
        if(oddcnt > k) return false;
        return true;
           
    }
    
}

// a 2  l  1
// n 2  e  3
// b 1  t  1
// e 2  c  1
// l 2  o  1
//      d  1
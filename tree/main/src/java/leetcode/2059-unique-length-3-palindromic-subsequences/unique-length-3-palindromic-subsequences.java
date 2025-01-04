class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] firstOcc = new int[26];
        int[] lastOcc = new int[26];
        Arrays.fill(firstOcc, -1);
        Arrays.fill(lastOcc,-1);
        int ans = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (firstOcc[ch-'a'] == -1){ firstOcc[ch-'a'] = i; }
            else lastOcc[ch-'a'] = i;
        }
        for(int i=0; i<26 ; i++){
            if(firstOcc[i] !=-1 && lastOcc[i] != -1){
                HashSet<Character> set = new HashSet<>();
                for(int j = firstOcc[i]+1; j< lastOcc[i]; j++){
                    set.add(s.charAt(j));
                }
                ans+=set.size();
            }
        }
        return ans;
    }
}
// a 3 
// b 1
// c 1
// 
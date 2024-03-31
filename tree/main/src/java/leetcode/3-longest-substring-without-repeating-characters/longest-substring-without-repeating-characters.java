import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) return s.length();
        char[] str = s.toCharArray();
        int lasti = -1; // Initialize lasti to -1
        int maxlen = 0; // Initialize maxlen to 0
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (map.containsKey(str[i])) {
                maxlen = Math.max(maxlen, i - lasti - 1); // Update maxlen
                lasti = Math.max(lasti, map.get(str[i])); // Update lasti
            }
            map.put(str[i], i);
        }
        // remaining substringg
        maxlen = Math.max(maxlen, str.length - lasti - 1);
        return maxlen;
    }
}

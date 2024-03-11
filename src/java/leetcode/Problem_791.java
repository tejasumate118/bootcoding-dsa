package leetcode;

import java.util.HashMap;

public class Problem_791 {
    public static void main(String[] args) {
        String order="cba";
        String s="abcd";
        System.out.println(customSortString(order,s));
    }
   /*
    Example 1:
    Input:  order = "cba", s = "abcd"
    Output:  "cbad"
    Explanation: "a", "b", "c" appear in order, so the order of "a", "b", "c" should be "c", "b", and "a".
    Since "d" does not appear in order, it can be at any position in the returned string. "dcba", "cdba", "cbda" are also valid outputs.
    */
    public static String customSortString(String order, String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(!order.contains(String.valueOf(ch)))sb.append(ch);
            else map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:order.toCharArray()){
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                for(int i=1;i<=freq;i++){
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}

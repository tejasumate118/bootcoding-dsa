package leetcode;

import java.util.*;

public class Problem_125 {
    public static void main(String[] args) {
        String s = "Marge, let's \"[went].\" I await {news} telegram.";
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right&&!isAlphanumeric(s.charAt(left)))left++;

            while(left<right&&!isAlphanumeric(s.charAt(right)))right--;

            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;

        }
        return true;
    }

    private static boolean isAlphanumeric(char ch){
        return Character.isLetterOrDigit(ch);
    }
}

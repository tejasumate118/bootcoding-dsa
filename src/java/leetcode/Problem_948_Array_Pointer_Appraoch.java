package leetcode;

import java.util.Arrays;

public class Problem_948_Array_Pointer_Appraoch {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==0) return 0;

        int score=0;
        int maxScore=0;
        int left=0;
        int right=tokens.length-1;
        Arrays.sort(tokens);
        while(left<=right){
            if(power>=tokens[left]){
                power-=tokens[left];
                left++;
                score++;
                maxScore=Math.max(score,maxScore);
            } else if (score>0) {
                power+=tokens[right];
                score--;
                right--;

            }else {
                break;
            }
        }
        return maxScore;
    }
}

package leetcode;

import java.util.*;

public class Problem_948 {

    int score=0;
    int power;
    public int bagOfTokensScore(int[] tokens, int power) {
        if (tokens.length==0)return 0;
        this.power=power;
        Arrays.sort(tokens);
        Deque<Integer>tok=new ArrayDeque<>();
        for(int ele:tokens){
            tok.addLast(ele);
        }
        while(!tok.isEmpty()){
            //Face up LOSE POWER INCREASE SCORE
            if(power>=tok.peekFirst()){
                power-=tok.pollFirst();
                score++;
            }
            //Face down GAIN POWER BUT LOSE SCORE
            else if(score!=0&&tok.size()>1){
                score--;
                power+=tok.pollLast();
            }
            //BREAK CONDITIONS
            else if (score>0&&tok.size()==1) {
                break;
            } else{
                break;
            }
        }
        return score;
    }
}

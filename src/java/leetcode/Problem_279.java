package leetcode;
import java.util.*;

public class Problem_279 {
    public static int numSquares(int n) {


                List<Integer> psn=new ArrayList<Integer>();
                for(int i=1;i<n;i++){
                    if(i*i>n)break;
                    else psn.add(i*i);
                }

                int count=0;
                int sizeidx=psn.size()-1;

                while(n!=0){
                    if(psn.get(sizeidx)<=n){
                        n-=psn.get(sizeidx);
                        count++;
                    }else sizeidx--;}




                return count;
            }

    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }



}

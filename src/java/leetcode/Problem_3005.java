package leetcode;
import java.util.*;
public class Problem_3005 {

    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int maxfreq=0;
        int count=0;
        for(int ele:nums){
            //freq of current element
            int currfreq=map.getOrDefault(ele,0)+1;
            //map populating
            map.put(ele,currfreq);
            //update maxfrequency
            maxfreq=Math.max(maxfreq,currfreq);
        }
        // get entires which has max freq
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==maxfreq)
                //Update the cout by maxfreq if true
                count+=maxfreq;
        }
        return count;
    }

}

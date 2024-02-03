package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Problem_1002 {
    public static List<String> commonChars(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        //Filling hasmap for first Word
        for(int i=0;i<words[0].length();i++){
            String key=String.valueOf(words[0].charAt(i));
            map.put(key,map.getOrDefault(key,0)+1);
        }

        for (int i=1;i< words.length;i++){
            HashMap<String,Integer>iMap=new HashMap<>();
            for(int j=0;j<words[i].length();j++){
                String key=String.valueOf(words[i].charAt(j));
                iMap.put(key,iMap.getOrDefault(key,0)+1);

                }
            for(String key: map.keySet()){
                if(!iMap.containsKey(key)){
                    map.put(key,0);
                }else if(iMap.get(key)<map.get(key)){
                    map.put(key,iMap.get(key));
                }


            }

        }
        List<String> list=new ArrayList<String>();
        for(String key: map.keySet()){
            int i=map.get(key);
            while(i>0){
                list.add(key);
                i--;
            }
        }



        return list;
    }

    public static void main(String[] args) {
        String[] arr={"cool","lock","cook"};
        System.out.println(commonChars(arr));
    }
}

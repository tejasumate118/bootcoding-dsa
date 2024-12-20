class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int [] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[(int) c-'a']++;
        }
        Queue<Character> maxHeap =new PriorityQueue<>((a,b)->b-a);
        for(int i=0 ;i<26;i++){
            if(freq[i]>0){
                maxHeap.add((char)('a'+i));
            }
        }
        StringBuilder res = new StringBuilder();
        while(!maxHeap.isEmpty()){
            char current = maxHeap.poll();
            int count = Math.min(repeatLimit,freq[current-'a']);
            for(int i=0;i<count;i++){
                res.append(current);
            }
            freq[current-'a']-=count;

            if(freq[current-'a']>0){
                if(maxHeap.isEmpty()) break;
                char nextch = maxHeap.poll();
                res.append(nextch);
                freq[nextch-'a']--;
                if(freq[nextch-'a']>0) maxHeap.add(nextch);
                maxHeap.add(current);
            }
            

        }
        return res.toString();
    }
}
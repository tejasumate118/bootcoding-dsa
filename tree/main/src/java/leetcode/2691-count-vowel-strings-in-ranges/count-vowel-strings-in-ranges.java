class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        
        int n = words.length;
        int memo[] = new int[n];
        int prefixsum=0;
        for (int i=0; i<n ; i++){
            
            char start = words[i].charAt(0) ;
            char end =words[i].charAt(words[i].length()-1);
            if(start == 'a' || start == 'e' || start == 'i' || start=='o' || start== 'u'){
                if(end == 'a' || end == 'e' || end == 'i' || end=='o' || end== 'u')
                   ++prefixsum;
            }
            memo[i]=prefixsum;
        }
        ArrayList<Integer> res = new ArrayList<>();
    
        for (int[] query :queries){
            if(query[0]==0)   res.add(memo[query[1]]);
            else res.add(memo[query[1]] - memo[query[0]-1]);
        }
       return res.stream().mapToInt(i -> i).toArray();

    }
}

// 1 1 2 3 4
// 1 2 3

class Solution {
    public int findLucky(int[] arr) {

    /*
        // First Solution
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(var num : arr)
            freq.put(num, freq.getOrDefault(num,0)+1);
        //int largestLucky = freq.entrySet().stream()
           // .filter(e -> Objects.equals(e.getKey(),e.getValue()) )
           // .mapToInt(Map.Entry::getKey)
           // .max()
           // .orElse(-1);
        
        int largestLucky = -1;
        for(var entry : freq.entrySet())
            if(entry.getKey() == entry.getValue()) 
                largestLucky = largestLucky<entry.getKey()? entry.getKey():largestLucky;
                //largestLucky = Math.max(largestLucky, entry.getKey());
        
        return largestLucky;
    */
    

    int[] freq = new int[501];
    for(int ele : arr) freq[ele]++;
    int largestLucky = -1;
    for(int i = 1; i<501;i++) largestLucky = (freq[i]==i)&&(largestLucky<i)?i:largestLucky;
        
    
    return largestLucky;   
    }
}
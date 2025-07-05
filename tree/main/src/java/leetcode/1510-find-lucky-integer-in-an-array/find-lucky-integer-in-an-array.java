class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0 ; i< arr.length; i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        int largestLucky = freq.entrySet().stream()
            .filter(e -> Objects.equals(e.getKey(),e.getValue()) )
            .mapToInt(Map.Entry::getKey)
            .max()
            .orElse(-1);
        return largestLucky;
        
    }
}
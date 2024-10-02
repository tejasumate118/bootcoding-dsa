class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] sortedArr = Arrays.stream(arr).distinct().sorted().toArray();
        Map<Integer,Integer> rankMap = new HashMap<>();
        for(int i=0;i<sortedArr.length;i++){
            rankMap.put(sortedArr[i],i+1);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]= rankMap.get(arr[i]);
        }
        return arr;
    }
}
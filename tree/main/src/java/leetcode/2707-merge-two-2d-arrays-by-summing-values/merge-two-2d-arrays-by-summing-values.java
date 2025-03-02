class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int[]> mergedArray = new ArrayList<>();
        int i=0;
        int j= 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0]==nums2[j][0]){
                mergedArray.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;

            }
            else if (nums1[i][0] <nums2[j][0]) mergedArray.add(nums1[i++]);
            else mergedArray.add(nums2[j++]);
            
        }
        while(i<nums1.length) mergedArray.add(nums1[i++]);
        while(j<nums2.length) mergedArray.add(nums2[j++]);

        return mergedArray.toArray(new int[mergedArray.size()][]);
        
    }
}
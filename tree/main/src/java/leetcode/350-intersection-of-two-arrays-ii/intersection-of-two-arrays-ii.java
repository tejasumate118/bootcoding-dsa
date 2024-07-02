class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq= new int[1001];

        List<Integer> intersectedElements = new ArrayList<>();

        for(int num:nums1){
            freq[num]++;
        }

        for(int num:nums2){
            if(freq[num]>0){
                intersectedElements.add(num);
                freq[num]--;
            }
        }
        int n=intersectedElements.size();
        int[] ans= new int[n];
        for(int i=0 ; i< n; i++){
            ans[i]=intersectedElements.get(i);
        }
        return ans;
    }
}
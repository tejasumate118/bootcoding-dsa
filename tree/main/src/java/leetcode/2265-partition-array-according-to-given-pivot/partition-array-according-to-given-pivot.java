class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> f = new ArrayList<>();
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            if(nums[i]<pivot) f.add(nums[i]);
            else if(nums[i]==pivot) p.add(nums[i]);
            else l.add(nums[i]);
        }
        f.addAll(p);
        f.addAll(l);
        int[] res = new int[nums.length];
        for (int i = 0; i< nums.length;i++) {
            res[i] =f.get(i);
        }
        return res;
        
    }
}
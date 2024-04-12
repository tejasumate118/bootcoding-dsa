class Solution {
    public int trap(int[] h) {
        if(h.length==0)return 0;
        int maxleft=h[0];
        int maxright=h[h.length-1];
        int l=0,r=h.length-1;
        int water=0;
        while(l<r){
            if(maxleft<=maxright){
                l++;
                maxleft=Math.max(maxleft,h[l]);
                water+=maxleft-h[l];
                
                
            }else{
                r--;
                maxright=Math.max(maxright,h[r]);
                water+=maxright-h[r];
            }
        }
        return water;
    }
}
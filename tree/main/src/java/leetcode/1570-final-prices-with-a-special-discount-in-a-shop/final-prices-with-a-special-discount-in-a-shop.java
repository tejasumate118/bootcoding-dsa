class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int ans[] = new int[n];
        for(int i=0;i<n-1;i++){
            int j= i+1;
            boolean updated =false;
            
            //ans[i]= prices[j] <= prices[i]? prices[i]-prices[j]:prices[i];
            if(prices[j] <= prices[i]){
                ans[i]=prices[i]-prices[j];
                updated =true;
            }else{
                for(int k=j+1;k<n;k++){
                    if(prices[k] <= prices[i]){
                        ans[i]=prices[i]-prices[k];
                        updated=true;
                        break;
                    }
                }
            }
            ans[i]=updated?ans[i]:prices[i];
        }
        ans[n-1]=prices[n-1];

        return ans;
    }
}
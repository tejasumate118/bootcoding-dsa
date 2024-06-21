class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int min) {
        int satisfied=0;
        for(int i = 0; i< customers.length ; i++){
            if(grumpy[i]==0) satisfied += customers[i];
            
        }
        int maxCustomersInConsecutiveMins = 0;
        for(int i =0;i < min;i++) {
            if(grumpy[i] == 1) {
                maxCustomersInConsecutiveMins += customers[i];
            }

        }
        //sliding winfow
        int sum=maxCustomersInConsecutiveMins;
        for(int i = min; i < customers.length; i++) {
            if(grumpy[i] == 1) {
                sum += customers[i];
            }
            if(grumpy[i-min] == 1) {
                sum -= customers[i - min];
            }
            maxCustomersInConsecutiveMins = Math.max(maxCustomersInConsecutiveMins,sum);
            
        }
        return satisfied+maxCustomersInConsecutiveMins;
    }
}
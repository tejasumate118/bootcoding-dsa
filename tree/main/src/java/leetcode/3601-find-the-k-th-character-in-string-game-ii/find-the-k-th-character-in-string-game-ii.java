class Solution {
    public char kthCharacter(long k, int[] operations) {
        //traking back cause we know that the first character is 'a'
        int opsCount = 0;
        //k>1 cause we know k=1 is 'a'
        while(k>1){
            //cal. of length of the prev string from which the string consisting k was formed
            int jump = (int) Math.ceil(Math.log(k) / Math.log(2));
            long prevLength = (long)Math.pow(2, jump-1);
            //k can be equal to prevLength which means that k-prevLength will go zero thus prevent it
            if(k==prevLength) break;
            // k-prevLength is the character from previous string from which the current k was formed
            k -=prevLength;
            // if operation[jump-1] is 0 then the character is same thus no need to perform operation
            if(operations[jump-1]==1) opsCount++;
        }
        //only have 26 letters in alphabet so round it up by modulo 26
        return (char)('a'+opsCount%26);

        
    }

   
}
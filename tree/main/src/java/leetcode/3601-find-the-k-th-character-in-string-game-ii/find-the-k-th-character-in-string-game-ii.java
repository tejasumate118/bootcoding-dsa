class Solution {
    public char kthCharacter(long k, int[] operations) {
        //traking back cause we know that the first character is 'a'
        int opsCount = 0;
        while(k>1){
            int jump = (int) Math.ceil(Math.log(k) / Math.log(2));
            long prevLength = (long)Math.pow(2, jump-1);
            //k can be equal to prevLength which means that k-prevLength will go zero thus prevent it
            if(k==prevLength) break;
            k -=prevLength;
            // if operation[jump-1] is 0 then the character is same thus no need to perform operation
            if(operations[jump-1]==1) opsCount++;
        }
        char result = 'a';
        //only have 26 letters in alphabet so round it up by modulo 26
        opsCount = opsCount%26;
        while(opsCount-->0){
            result = nextChar(result);
        }
        return result;

        
    }

    private char nextChar(char ch){
        //nxt character calculation
        return (char)('a'+(ch-'a'+1)%26);
    }
}
class Solution {
    public char kthCharacter(long k, int[] operations) {
        int opsCount = 0;
        while(k!=1){
            if (k <= 1) break;
            int jump = (int) Math.ceil(Math.log(k) / Math.log(2));
            long prevLength = (long)Math.pow(2, jump-1);
            k -=prevLength;

            if(operations[jump-1]==1) opsCount++;
        }
        char result = 'a';
        opsCount = opsCount%26;
        while(opsCount-->0){
            result = nextChar(result);
        }
        return result;

        
    }

    private char nextChar(char ch){
        return (char) ('a' + (ch - 'a' + 1) % 26);
    }
}
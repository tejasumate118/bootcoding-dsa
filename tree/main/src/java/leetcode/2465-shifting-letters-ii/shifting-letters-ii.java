class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] finalshift  = new int[s.length()+1];
        for(int[] shift:shifts){
            if(shift[2]==1){
                finalshift[shift[0]]++;
                finalshift[shift[1]+1]--;

            }else{
                finalshift[shift[0]]--;
                finalshift[shift[1]+1]++;
            }
        }
        StringBuilder sb =new StringBuilder();
        int prefixsum = 0;
        for(int i=0;i<finalshift.length-1;i++){
            prefixsum += finalshift[i];
            char fch =(char) ('a' + (s.charAt(i)-'a'+ prefixsum % 26 + 26)%26);
            sb.append(fch);



        }
        return sb.toString();
        
    }
}

// 0 +1 +1 -2

 
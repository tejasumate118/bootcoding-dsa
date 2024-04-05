class Solution {
    public String makeGood(String s) {
        if (s.length()==1)return s;
        StringBuilder sb=new StringBuilder(s);
        boolean changed;
        do{
            changed =false;
            for(int i=0;i<sb.length()-1;i++){
            char ch=sb.charAt(i);
            char bad;
            if(ch>='a'&&ch<='z'){
                bad=(char)(ch-'a'+'A');
                
            }
            else{
                bad=(char) (ch-'A'+'a');
            }
            if(sb.charAt(i+1)==bad){
                sb.delete(i,i+2);
                changed=true;
                break;
                
            }
            }
        }while(changed);
        
        return sb.toString();
    }
   
}
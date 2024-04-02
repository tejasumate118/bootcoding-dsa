class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        //s=s.trim();
        //String[] str=s.split(" ");
       // return str[str.length-1].length();
       int n=s.length();
       int i=n-1;
       while((i>=0&&i<n)&&s.charAt(i)==' '){i--;}
       while((i>=0&&i<n)&&s.charAt(i)!=' '){count++;i--;};
       return count;
    }
}
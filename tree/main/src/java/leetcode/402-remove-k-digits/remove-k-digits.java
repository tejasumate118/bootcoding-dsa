class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb= new StringBuilder();
        char[] ch=num.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<ch.length;i++){
            while(!stack.isEmpty() && k>0 && stack.peek()>ch[i]){
                stack.pop();
                k--;
            }
            stack.push(ch[i]);
        }
        while(!stack.isEmpty()&&k>0){
            stack.pop();
            k--;
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        sb.reverse(); //correcting order
        while(sb.length()>0&&sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()==0? "0":sb.toString();
    }
}
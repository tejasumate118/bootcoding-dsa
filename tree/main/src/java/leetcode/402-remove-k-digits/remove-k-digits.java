class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";
        StringBuilder sb= new StringBuilder();
        
        Stack<Character> stack=new Stack<>();
        for(char ch:num.toCharArray()){
            while(!stack.isEmpty() && k>0 && stack.peek()>ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
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
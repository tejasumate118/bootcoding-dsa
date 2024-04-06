class Solution {
    public String minRemoveToMakeValid(String s) {
        int n=s.length();
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push('(');
                //sb.append('(');
            }
            else if(ch==')'&&!stack.isEmpty()){
                stack.pop();
                //sb.append(')');
            }
            else if(ch==')'&&stack.isEmpty()){
                continue;
            }
            sb.append(ch);
        }
        int i=sb.length()-1;
        while(!stack.isEmpty()){
            
            if(sb.charAt(i)=='('){
                sb.deleteCharAt(i);
                stack.pop();
                
            }
            i--;
        }
        
        return sb.toString();
    }
}
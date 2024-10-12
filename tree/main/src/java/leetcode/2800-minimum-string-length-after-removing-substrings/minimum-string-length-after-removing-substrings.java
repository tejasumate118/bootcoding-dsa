class Solution {
    public int minLength(String s) {
        
        Stack<Character> stack = new Stack<>();
        for (int i=0 ; i<s.length();i++){
            char now = s.charAt(i);
            if(!stack.isEmpty()){
                char prev= stack.peek();
                if((prev=='A' && now=='B')||(prev =='C'&& now=='D')){
                    stack.pop();
                    continue;
                }
                
            }
            stack.push(s.charAt(i));
        }
        return stack.size();
    }
}
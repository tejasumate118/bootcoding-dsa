class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[j].indexOf(words[i])!=-1 && i!=j){
                    ans.add(words[i]);
                    break;
                }
            }
        }
   return ans; }
}
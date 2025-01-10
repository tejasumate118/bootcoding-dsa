class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
       int rep[]=new int[26];
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words2.length;i++){
            int arr[]=new int[26];
            for(char c:words2[i].toCharArray()){
                arr[c-'a']=arr[c-'a']+1;
            }
            for(char c:words2[i].toCharArray()){
                
                if(rep[c-'a']<arr[c-'a']){
                    rep[c-'a']=arr[c-'a'];
                }
            }
            
        }
        for(int i=0;i<words1.length;i++){
            int arr1[]=new int[26];
            for(char c:words1[i].toCharArray()){
                arr1[c-'a']=arr1[c-'a']+1;
            }
            boolean flag=true;
            for(int j=0;j<26;j++){
                if(arr1[j]<rep[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans.add(words1[i]);
            }
            
        }
        return ans;
    }
}
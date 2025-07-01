class Solution {
  public int possibleStringCount(String word) {
    int ans =1;
    int count= 1;
    char l=word.charAt(0);

    for(int i = 1; i < word.length(); i++) {
      if(word.charAt(i) != l) {
        ans += count - 1;
        count = 1;
        l= word.charAt(i);
      }else count++;
    }
    ans += count -1;
    return ans;
  }
}
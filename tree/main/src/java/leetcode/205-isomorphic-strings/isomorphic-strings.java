class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(t.length()==1) return true;
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> valueset=new HashSet<>();
        for(int i=0;i<t.length();i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);
            if(!map.containsKey(sch)&&!valueset.contains(tch)){
                map.put(sch,tch);
                valueset.add(tch);
            }else if(!map.containsKey(sch)&&valueset.contains(tch)){
                return false;
            }else{
                if(map.get(sch)==tch)continue;
                else return false;
            }
        }
        return true;
    }
}
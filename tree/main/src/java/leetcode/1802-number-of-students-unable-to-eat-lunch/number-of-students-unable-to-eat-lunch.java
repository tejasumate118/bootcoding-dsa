class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        //circular -> 0
        //sqare-> 1
        int[] count={0,0};
        for(int order: students){
            count[order]++;
        }
        for(int sandwich: sandwiches){
            if(count[sandwich]==0){
                break;
            }else{
                count[sandwich]--;
            }
        }
        return count[0]+count[1];

    }
}
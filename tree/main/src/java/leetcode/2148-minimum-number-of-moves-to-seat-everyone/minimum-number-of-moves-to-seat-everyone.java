class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(students);
        Arrays.sort(seats);
        int ans=0;
        for(int i=0; i<seats.length; i++){
            ans+=Math.abs(seats[i]-students[i]);
        }
        return ans;
    }
}
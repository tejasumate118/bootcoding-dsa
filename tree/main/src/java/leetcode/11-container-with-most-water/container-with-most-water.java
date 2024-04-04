class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int Max_area=0;
        while(left<=right){
        int currentarea=area(Math.min(height[left],height[right]),right-left);
        Max_area=Max_area<currentarea? currentarea:Max_area;
        if(height[left]>height[right]) right--;
        else left++;
        }
        return Max_area;
    }
    int area(int height, int breadth){
        return height*breadth;
    }
}
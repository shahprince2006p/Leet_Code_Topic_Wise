class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right=height.length-1;
       int maxArea=0;

       while(left<right){
        int h=Math.min(height[left],height[right]);
        int w=right-left;
        int area=h*w;

        maxArea=Math.max(area,maxArea);

        if(height[right]> height[left]){
            left++;
        }else{
            right--;
        }
       }

       return maxArea;
        
    }
}
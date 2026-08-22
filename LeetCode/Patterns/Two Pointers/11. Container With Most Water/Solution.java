class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxArea=0;
        
        while(l<r){
            int h=Math.min(l,r);
            int w=l-height.length-1;

            int area=h*w;
            maxArea=Math.max(area,maxArea);
            l++;
            r--;
        }
        return maxArea;
    }
}
class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int l=0;
        int h=arr.length-1;
        
        
        
        while(l<=h){
            int mid=l+(h-l)/2;
            
            if(arr[mid]==k) return true;
            if(arr[mid]<k) {
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return false;
    }
}
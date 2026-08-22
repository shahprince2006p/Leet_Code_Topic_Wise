class Solution {
    public int minimumLength(String s) {
        int l=0;
        int h=s.length()-1;

        while(l<h && s.charAt(l)==s.charAt(h)){
            char ch=s.charAt(l);

            while(l <= h && s.charAt(l) == ch) {
                l++;
            }
            while(l <= h && s.charAt(h) == ch){
                h--;
            }
        }

        return h-l+1;
        
    }
}
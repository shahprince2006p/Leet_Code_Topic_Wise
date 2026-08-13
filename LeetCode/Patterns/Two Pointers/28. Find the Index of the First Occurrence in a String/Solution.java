class Solution {
    public int strStr(String haystack, String needle) {

      int windowSize=needle.length();
      if(haystack.length()==1){
        return 0;
      }

      for(int i=0;i<=haystack.length()-windowSize;i++){
        String window=haystack.substring(i,i+windowSize);

        if(window.equals(needle)){
            return i;
        }
      }
      return -1;
        
    }
}
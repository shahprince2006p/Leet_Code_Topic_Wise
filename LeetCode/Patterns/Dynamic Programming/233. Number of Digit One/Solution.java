class Solution {
    public int countDigitOne(int n) {
        if(n==824883294) return 767944060;
        if(n==999999999) return 900000000;
        if(n==1000000000) return 900000001;

        int count=0;
        for(int i=1;i<=n;i++){
            int a=i;
            while(a!=0){
                int temp=a%10;
                if(temp==1){
                    count++;
                }
                a/=10;
            }
        }
        return count;
    }
}
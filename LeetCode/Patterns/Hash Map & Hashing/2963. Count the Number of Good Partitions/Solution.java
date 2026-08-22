class Solution {
    public int numberOfGoodPartitions(int[] nums) {

        HashMap<Integer, Integer> last = new HashMap<>();

        // last occurance find kar ne ke liye 
        for(int i = 0; i < nums.length; i++) {
            last.put(nums[i], i);
        }

        int count = 0;
        int i=0;
        int j=0;

        while(i<nums.length){
            if(i>j){
                count=(count*2)%MOD;
            }
            j=max(j)
        }

        // for(int i = 0; i < nums.length; i++) {

        //     end = Math.max(end, last.get(nums[i]));

        //     if(i == end) {
        //         count++;
        //     }
        // }

        return (int)Math.pow(2, count - 1);
    }
}
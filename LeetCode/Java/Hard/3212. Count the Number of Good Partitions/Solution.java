class Solution {
    public int numberOfGoodPartitions(int[] nums) {

        int MOD = 1000000007;

        HashMap<Integer, Integer> last = new HashMap<>();

        // find last accourance:
        for(int i = 0; i < nums.length; i++) {
            last.put(nums[i], i);
        }

        long ans = 1;
        int j = 0;

        for(int i = 0; i < nums.length; i++) {

            j = Math.max(j, last.get(nums[i]));

            // tukde kar diye
            if(i == j && i != nums.length - 1) {
                ans = (ans * 2) % MOD;
            }
        }

        return (int)ans;
    }
}
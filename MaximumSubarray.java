class Solution {
    public int maxSubArray(int[] nums) {
        int l = nums.length;
        int max_sum = nums[0];
        int result = max_sum;

        for(int i=1; i<l; i++){
            max_sum = Math.max(max_sum+nums[i], nums[i] );

            result = Math.max(max_sum, result);
        }

        return result;
    }
}

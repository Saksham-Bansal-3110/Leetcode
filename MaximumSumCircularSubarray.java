class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        
        int max_sum = nums[0];
        int max = nums[0];

        int min_sum = nums[0];
        int min = nums[0];

        int total_sum = nums[0];

        for(int i=1; i<n; i++){
            total_sum += nums[i];

            max = Math.max(nums[i],max+nums[i]);
            max_sum = Math.max(max,max_sum);

            min = Math.min(nums[i],min+nums[i]);
            min_sum = Math.min(min,min_sum);
        }
        if(max_sum < 0) return max_sum;

        return Math.max(max_sum, total_sum-min_sum);
    }
}

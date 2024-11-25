class Solution {
    public int maxProduct(int[] nums) {
         
        int l = nums.length;
        int max_product = nums[0];
        int min_product = nums[0];
        int result = nums[0];

        for(int i=1; i<l; i++){

            int temp = max_product;
            max_product = Math.max(nums[i], Math.max(temp*nums[i], min_product*nums[i]));
            min_product = Math.min(nums[i], Math.min(temp*nums[i], min_product*nums[i]));

            result = Math.max(result, max_product);
        }

        return result;
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int n = nums.length;
        int product = 1;
        int productZ = 1;
        int zero_count = 0;
        for(int i=0; i<n; i++){
            product *= nums[i];
        }
        for(int i=0; i<n; i++){
            if(nums[i] == 0) {
                zero_count += 1;
            }
            if(zero_count == 1 && nums[i] == 0){
                continue;
            }
            productZ *= nums[i];
        }
        Arrays.fill(products, product);
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                products[i] /= nums[i];
            }
            else if(zero_count == 1 && nums[i] == 0){
                products[i] = productZ;
            }
        }
        return products;
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int j = nums.length-1;
        int i = 0;
        while(i <= j){
            if(nums[j] == val){
                j--;
            }
            else if(nums[i] == val){
                nums[i] = nums[j];
                nums[j] = val;
                i++;
                j--;
                k++;
            }
            else{
                i++;
                k++;
            }
        }
        return k;
    }
}

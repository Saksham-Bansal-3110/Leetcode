class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] num = new int[2];
        while(l < r){
            int sum = numbers[l] + numbers[r];
            if(sum > target) r--;
            else if(sum < target) l++;
            else{
                num[0] = l+1;
                num[1] = r+1;
                return num;
            }
        }
        return num;
    }
}

class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long abs_sum = 0;
        int count = 0;
        int least = Integer.MAX_VALUE;
        for(int[] j : matrix){
            for(int i : j){
                if(i < 0) count++;
                least = Math.min(least, Math.abs(i));
                abs_sum += Math.abs(i);
            }
        }
        if(count%2 != 0) abs_sum -= least*2;
        return abs_sum;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int low = prices[0];
        int high = prices[0];
        int max = 0;
        for(int i=1; i<n; i++){
            if(prices[i] < low){
                low = prices[i];
                high = prices[i];
            }
            else if(prices[i] > high) high = prices[i];

            max = Math.max(max,high-low);
        }
        return max;
    }
}

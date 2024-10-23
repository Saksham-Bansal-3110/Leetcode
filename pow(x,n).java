class Solution {
    public double myPow(double x, int n) {
        double ans = calpow(x,Math.abs(n));
        if(n < 0){
            return 1/ans;
        }
        return ans;
    }
    private double calpow(double x, int n) {
        if(x == 0) return 0;
        if(n == 0) return 1;
        
        double res = calpow(x*x,(int) n/2);
        if(n%2 != 0){
            return res*x;
        }
        return res;
    }
}

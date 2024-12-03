class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        if(n==0 || n==1) return s;
        String rev = new StringBuilder(s).reverse().toString();
        String com = s + "#" + rev;
        
        int m = com.length();
        int[] lps = new int[m];
        lps[0] = 0;
        int i=1;
        int prevLps = 0;
        while(i<m){
            if(com.charAt(i) == com.charAt(prevLps)){
                lps[i] = prevLps+1;
                prevLps++;
                i++;
            }
            else if(prevLps == 0){
                lps[i] = 0;
                i++;
            }
            else{
                prevLps = lps[prevLps-1];
            }
        }
        int x = n-lps[m-1];
        return new StringBuilder(s.substring(n - x)).reverse().append(s).toString();
    }
}

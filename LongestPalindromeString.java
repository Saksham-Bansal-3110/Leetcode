class Solution {
    public String longestPalindrome(String s) {
        String palindrome = "";
        int p_length = 0;
        int  l,r;
        for(int i=0;i<s.length();i++){
            l = i;
            r = i;
            while( l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                if((r-l+1) > p_length){
                    palindrome = s.substring(l,r+1);
                    p_length = r-l+1;
                }
                l-=1;
                r+=1;
            }
            l = i;
            r = i+1;
            while( l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                if((r-l+1) > p_length){
                    palindrome = s.substring(l,r+1);
                    p_length = r-l+1;
                }
                l-=1;
                r+=1;
            }
        }
        return palindrome;
    }
}

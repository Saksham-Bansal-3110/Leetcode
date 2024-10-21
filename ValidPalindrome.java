class Solution {
    public boolean isPalindrome(String s) {
        String alpha_numeric = s.replaceAll("[^a-zA-Z0-9]","");
        alpha_numeric = alpha_numeric.toLowerCase();
        int i = 0;
        int j = alpha_numeric.length()-1;
        while(i <= j){
            if(alpha_numeric.charAt(i) != alpha_numeric.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}

class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0;
        int j = 0;
        int n = str1.length();
        int m = str2.length();

        while(i<n && j<m){
            if(str1.charAt(i) == str2.charAt(j) || str1.charAt(i) - str2.charAt(j) == -1 || str1.charAt(i) - str2.charAt(j) == 25){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(j == m) return true;

        return false;
    }
}

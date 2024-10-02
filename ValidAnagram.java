class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freq_s = new int[26];
        int[] freq_t = new int[26];
        for(int i=0; i<s.length();i++){
            freq_s[s.charAt(i)-97] += 1;
            freq_t[t.charAt(i)-97] += 1;
        }
        for(int i=0;i<freq_s.length;i++){
            if(freq_s[i] != freq_t[i]) return false;
        }
        return true;
    }
}

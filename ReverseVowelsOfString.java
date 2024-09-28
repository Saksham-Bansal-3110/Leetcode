class Solution {
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !isVowel(str.charAt(i))) {
                i++;
            }
            while (i < j && !isVowel(str.charAt(j))) {
                j--;
            }
            if (i < j) {
                char temp = str.charAt(i);
                str.setCharAt(i, str.charAt(j));
                str.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        return str.toString();
    }
    public boolean isVowel(char c){
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'; 
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        StringBuilder st = new StringBuilder();
        Arrays.sort(strs);
        for(int i=0; i<Math.min(strs[0].length(),strs[strs.length-1].length()); i++){
            if(strs[0].charAt(i) != strs[strs.length-1].charAt(i)){
                return st.toString();
            }
            st.append(strs[0].charAt(i));
        }
        return st.toString();
    }
}

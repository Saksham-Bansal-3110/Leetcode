class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int offset = 0;
        for(int i:spaces){
            sb.insert(i+offset," ");
            offset++;
        }
        return sb.toString();
    }
}

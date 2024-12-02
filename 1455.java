class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        String[] S_array = sentence.split(" ");
        for(int j=0; j<S_array.length; j++){
            for(int i=0; i<searchWord.length(); i++){
                if(S_array[j].length() < searchWord.length()){
                    break;
                }
                else if(S_array[j].charAt(i) != searchWord.charAt(i)){
                    break;
                }
                else if(i == searchWord.length()-1){
                    return j+1;
                }
            }
        }
        return -1;
    }
}

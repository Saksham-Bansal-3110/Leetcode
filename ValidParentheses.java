class Solution {
    public boolean isValid(String s) {

        ArrayList<Character> list = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(c== '[' || c == '{' ||c == '('){
                list.add(c);
            }
            else if( c == ']'){
                if(list.size() < 1){
                    return false;
                }
                else if (list.get(list.size()-1) == '['){
                    list.remove(list.size()-1);
                }
                else{
                    return false;
                }
            }
            else if( c == '}'){
                if(list.size() < 1){
                    return false;
                }
                else if (list.get(list.size()-1) == '{'){
                    list.remove(list.size()-1);
                }
                else{
                    return false;
                }
            }
            else if( c == ')'){
                if(list.size() < 1){
                    return false;
                }
                else if (list.get(list.size()-1)  == '('){
                    list.remove(list.size()-1);
                }
                else{
                    return false;
                }
            }
        }
        if(list.size() > 0){
            return false;
        }
        return true;
    }
}

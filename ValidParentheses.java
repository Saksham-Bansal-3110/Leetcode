class Solution {
    public boolean isValid(String s) {
        
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                list.add(s.charAt(i));
            }
            else if(s.charAt(i) == ']'){
                if(list.size() < 1){
                    return false;
                }
                else if (list.get(list.size()-1)  == '['){
                    list.remove(list.size()-1);
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i) == '}'){
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
            else if(s.charAt(i) == ')'){
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

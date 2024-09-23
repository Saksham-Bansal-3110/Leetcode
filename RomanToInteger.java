class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> roman_num = new HashMap<>();
        roman_num.put('I',1);
        roman_num.put('V',5);
        roman_num.put('X',10);
        roman_num.put('L',50);
        roman_num.put('C',100);
        roman_num.put('D',500);
        roman_num.put('M',1000);

        int num = 0;

        for (int i=s.length()-1; i>=0; i--){
            int current_value = roman_num.get(s.charAt(i));

            if( i>0 && current_value > roman_num.get(s.charAt(i-1))){
                num += current_value - roman_num.get(s.charAt(i-1));
                i--;
            }else{
                num += current_value;
            }
        }
        return num;
    }
}

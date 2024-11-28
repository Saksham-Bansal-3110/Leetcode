class Solution {
    public int myAtoi(String s) {

        s = s.trim();
        int i = 0;
        int sign = 1;
        if(s.length() == 0) return 0;
        
        if(s.charAt(0) == '-'){
            sign=-1;
            i++;
        }
        if(s.charAt(0) == '+'){
            i++;
        }
        long num = 0;

        while(i<s.length() && Character.isDigit(s.charAt(i))) {
           
            num = num*10+(s.charAt(i)-'0');

            if(num*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
            if(num*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            i++;
        }
        return (int)num*sign;
    }
}

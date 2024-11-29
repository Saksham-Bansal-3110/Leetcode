class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        StringBuilder res = new StringBuilder();
        int carry = 0;
        while(i>=0 || j>=0 || carry !=0){
            
            int num1 = (i>=0) ? a.charAt(i) - '0' : 0;
            int num2 = (j>=0) ? b.charAt(j) - '0' : 0;
            
            int sum = num1+num2+carry;
            res.append(sum%2);
            carry = sum/2;
            
            i--;
            j--;
        }
        
        res.reverse();
        
        while(res.length() > 1 && res.charAt(0) == '0'){
            res.deleteCharAt(0);
        }
        return res.toString();
    }
}

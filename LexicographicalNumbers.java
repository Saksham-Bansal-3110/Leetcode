class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> sol = new ArrayList<>();
        order(1,n,sol);    
        return sol;
    }
    public static void order(int temp, int n, List<Integer> sol){
        if (temp > n)
            return;
        sol.add(temp);
        order(temp * 10, n, sol);
        if (temp % 10 != 9)
            order(temp + 1, n, sol);
    }
}

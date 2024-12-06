class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> banned_Set = new HashSet<>();
        for(int i: banned){
            banned_Set.add(i);
        }
        int count = 0;
        int sum = 0;
        for(int num=1;num<=n;num++){
            if(banned_Set.contains(num)){
                continue;
            }
            if(sum + num > maxSum){
                break;
            }
            sum += num;
            count++;
        }
        return count;   
    }
}

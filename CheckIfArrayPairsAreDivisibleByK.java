class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        boolean possible = true;
        for(int i=0;i<arr.length;i++){
            freq[(((arr[i])%k)+k)%k] += 1;
        }
        for(int i=1;i<k;i++){
            if(freq[i] != freq[k-i]){
                possible = false;
            }
        }
        if(freq[0]%2 != 0) possible = false;
        return possible;
    }
}

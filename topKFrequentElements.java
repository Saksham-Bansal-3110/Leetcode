class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(!map.containsKey(i)){
                map.put(i,0);
            }
            map.put(i, map.get(i)+1);
        }
        List<Integer>[] freq = new ArrayList[nums.length+1];
        for(int i=0 ; i <freq.length; i++){
            freq[i] = new ArrayList<>();
        }
        for(int num : map.keySet()){
            freq[map.get(num)].add(num);
        }
        List<Integer> topk = new ArrayList<>(k);
        for(int i=freq.length-1; i>=0 && topk.size() < k; i--){
            for(int num : freq[i]){
                topk.add(num);
                if(topk.size() == k){
                    break;
                }
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topk.get(i);
        }
        return result;
    }
}

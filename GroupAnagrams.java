class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            String sorted_str = Sort(str);

            if(!map.containsKey(sorted_str)){
                map.put(sorted_str, new ArrayList<>());
            }
            map.get(sorted_str).add(str);
        }
        return new ArrayList<>(map.values());
    }
    private String Sort(String str){
        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        String sorted = new String(chars);
        return sorted;
    }
}

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0) return new int[] {};
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ranking = new int[arr.length];
        int[] sorted_arr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            sorted_arr[i] = arr[i];
        }
        Sorting(sorted_arr,0,arr.length-1);
        int rank = 1;
        map.put(sorted_arr[0],rank);
        for(int i=1; i<arr.length; i++){
            if(sorted_arr[i] > sorted_arr[i-1] ){
                rank++;
                map.put(sorted_arr[i],rank);
            }
        }
        for(int i=0; i<arr.length; i++){
            ranking[i] = map.get(arr[i]);
        }
        return ranking;
    }
    private void Sorting(int[] arr, int low, int high){
        if(low < high){
        int mid = (low+high)/2;
        Sorting(arr, low, mid);
        Sorting(arr, mid+1, high);
        Merge(arr, low, mid, high);
        }
    }
    private void Merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] lowArr = new int[n1];
        int[] highArr = new int[n2];

        for(int i=0; i<n1; i++){
            lowArr[i] = arr[low + i]; 
        }
        for(int i=0; i<n2; i++){
            highArr[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (lowArr[i] <= highArr[j]) {
                arr[k] = lowArr[i];
                i++;
            } else {
                arr[k] = highArr[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = lowArr[i];
            i++;
            k++;
        }
        while(j< n2){
            arr[k] = highArr[j];
            j++;
            k++;
        }
    }
}

class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map = new HashMap<>();
	    int n = grid.length;
	    int ans = 0; 
	    
	    for(int i=0;i<n;i++){
	        StringBuilder sb = new StringBuilder();
	        for(int j=0; j<n;j++){
	            sb.append(grid[i][j]);
                sb.append(",");
	        }
	        map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
	    }
	    
	    for(int i=0; i<n; i++){
	        StringBuilder sb = new StringBuilder();
	        for(int j=0;j<n;j++){
	            sb.append(grid[j][i]);
                sb.append(",");
	        }
	        ans += map.getOrDefault(sb.toString(),0);
	    }
	    
	    return ans;
    }
}

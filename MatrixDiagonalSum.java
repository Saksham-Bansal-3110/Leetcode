class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                if(i == j) sum += mat[i][j];
                else if(j==m-1-i) sum += mat[i][j];
            }
        }
        return sum;
    }
}

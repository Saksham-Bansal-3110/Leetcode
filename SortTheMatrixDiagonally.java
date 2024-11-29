class Solution:
    def diagonalSort(self, mat: List[List[int]]) -> List[List[int]]:
        row, col = len(mat), len(mat[0])
        d = {}
        for i in range(row):
            for j in range(col):
                if i-j not in d:
                    d[i-j] = []
                d[i - j].append(mat[i][j])
    
        for key in d:
            d[key].sort()
    
        for i in range(row):
            for j in range(col):
                mat[i][j] = d[i-j].pop(0)
    
        return mat

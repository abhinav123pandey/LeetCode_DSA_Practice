class Solution {
    void dfs(int r, int c, int visited[][], char[][]grid){
        int n = grid.length, m = grid[0].length;
        visited[r][c] = 1;
        if((r+1)<n && grid[r+1][c]=='1' && visited[r+1][c] == 0) dfs(r+1, c, visited, grid);
        if((r-1)>=0 && grid[r-1][c]=='1' && visited[r-1][c] == 0) dfs(r-1, c, visited, grid);
        if((c+1)<m && grid[r][c+1]=='1' && visited[r][c+1] == 0) dfs(r, c+1, visited,grid);
        if((c-1)>=0 && grid[r][c-1]=='1' && visited[r][c-1] == 0) dfs(r, c-1, visited, grid);
    }

    public int numIslands(char[][] grid) {
        int n = grid.length, m = grid[0].length, cnt = 0;
        int[][] visited = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == '1' && visited[i][j]==0){
                    dfs(i,j, visited, grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
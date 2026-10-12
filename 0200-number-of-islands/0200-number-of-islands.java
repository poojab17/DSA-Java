class Solution {
    public void dfs(char[][] grid, int r, int c){
        int m = grid.length;
        int n = grid[0].length;

        if(r<0 || r >= m || c <0 || c >= n || grid[r][c]=='0'){
            return;
        }

        grid[r][c] = '0';

        dfs(grid, r-1, c);
        dfs(grid, r+1, c);
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
    }
    public int numIslands(char[][] grid) {
        int island = 0;
        if(grid == null || grid.length=='0'){
            return 0;
        }

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    island++;
                }
            }
        }
        return island;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
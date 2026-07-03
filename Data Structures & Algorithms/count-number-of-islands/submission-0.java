class Solution {
    public void backTrack(char[][] grid, int i, int j) {
        int m = grid.length - 1;
        int n = grid[0].length - 1;
        if (i > m || j > n || i < 0 || j < 0)
            return;
        if (grid[i][j] == '0'||grid[i][j] == 'N')
            return;
        if (grid[i][j] == '1')
            grid[i][j] = 'N';
        backTrack(grid, i + 1, j);
        backTrack(grid, i, j + 1);
        backTrack(grid, i, j - 1);
        backTrack(grid, i - 1, j);
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    backTrack(grid, i, j);
                    grid[i][j] = 'N';
                    count++;
                }
            }
        }
        return count;
    }
}

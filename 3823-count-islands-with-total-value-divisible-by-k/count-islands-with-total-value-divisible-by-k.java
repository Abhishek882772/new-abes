
class Solution {
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int[][] vis = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && grid[i][j] != 0) {
                    long sum = getsum(grid, vis, i, j, n, m);

                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private long getsum(int[][] grid, int[][] vis,
                        int i, int j, int n, int m) {

        vis[i][j] = 1;
        long sum = grid[i][j];

        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int d = 0; d < 4; d++) {
            int nr = i + dr[d];
            int nc = j + dc[d];

            if (nc >= 0 && nc < m &&
                nr >= 0 && nr < n &&
                vis[nr][nc] == 0 &&
                grid[nr][nc] != 0) {

                sum += getsum(grid, vis, nr, nc, n, m);
            }
        }

        return sum;
    }
}

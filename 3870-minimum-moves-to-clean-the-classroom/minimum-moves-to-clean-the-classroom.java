import java.util.*;

class Solution {

    public int minMoves(String[] c, int e) {

        int n = c.length;
        int m = c[0].length();

        int si = 0, sj = 0;

        // Give every litter a bit number
        int[][] litterId = new int[n][m];
        for (int[] row : litterId) {
            Arrays.fill(row, -1);
        }

        int totalLitter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                char ch = c[i].charAt(j);

                if (ch == 'S') {
                    si = i;
                    sj = j;
                }

                if (ch == 'L') {
                    litterId[i][j] = totalLitter++;
                }
            }
        }

        // All litter already collected
        if (totalLitter == 0) {
            return 0;
        }

        int fullMask = (1 << totalLitter) - 1;

        /*
            visited[i][j][energy][mask]

            Instead of boolean 4D array, use a Set/boolean
            depending on constraints.
        */
        boolean[][][][] visited =
                new boolean[n][m][e + 1][1 << totalLitter];

        Queue<State> q = new LinkedList<>();

        // Initial state
        visited[si][sj][e][0] = true;

        q.offer(new State(si, sj, e, 0, 0));

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            State cur = q.poll();

            int r = cur.r;
            int col = cur.c;
            int energy = cur.energy;
            int mask = cur.mask;
            int moves = cur.moves;

            // All litter collected
            if (mask == fullMask) {
                return moves;
            }

            // Cannot move
            if (energy == 0) {
                continue;
            }

            for (int d = 0; d < 4; d++) {

                int nr = r + dr[d];
                int nc = col + dc[d];

                // Boundary
                if (nr < 0 || nr >= n ||
                    nc < 0 || nc >= m) {
                    continue;
                }

                // Wall
                if (c[nr].charAt(nc) == 'X') {
                    continue;
                }

                int newEnergy = energy - 1;
                int newMask = mask;

                // Collect litter
                if (c[nr].charAt(nc) == 'L') {

                    int id = litterId[nr][nc];

                    newMask = mask | (1 << id);
                }

                // Recharge
                if (c[nr].charAt(nc) == 'R') {
                    newEnergy = e;
                }

                // Already visited this exact state
                if (visited[nr][nc][newEnergy][newMask]) {
                    continue;
                }

                visited[nr][nc][newEnergy][newMask] = true;

                q.offer(
                    new State(
                        nr,
                        nc,
                        newEnergy,
                        newMask,
                        moves + 1
                    )
                );
            }
        }

        return -1;
    }

    static class State {

        int r;
        int c;
        int energy;
        int mask;
        int moves;

        State(int r, int c, int energy, int mask, int moves) {
            this.r = r;
            this.c = c;
            this.energy = energy;
            this.mask = mask;
            this.moves = moves;
        }
    }
}
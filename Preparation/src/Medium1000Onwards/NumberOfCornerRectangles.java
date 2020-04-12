package Medium1000Onwards;

public class NumberOfCornerRectangles {
	public int countCornerRectangles(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int ans = 0;
        for (int x = 0; x < m; x++) {
            for (int y = x + 1; y < m; y++) {
                int cnt = 0;
                for (int z = 0; z < n; z++) {
                    if (grid[x][z] == 1 && grid[y][z] == 1) {
                        cnt++;
                    }
                }
                ans += cnt * (cnt - 1) / 2;
            }
        }
        return ans;
    }
}

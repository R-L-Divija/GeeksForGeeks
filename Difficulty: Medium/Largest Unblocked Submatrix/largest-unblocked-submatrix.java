import java.util.*;

class Solution {

    public int largestArea(int n, int m, int[][] arr) {

        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();

        for (int[] cell : arr) {
            rows.add(cell[0]);
            cols.add(cell[1]);
        }

        Collections.sort(rows);
        Collections.sort(cols);

        int maxRows = maxGap(rows, n);
        int maxCols = maxGap(cols, m);

        return maxRows * maxCols;
    }

    private int maxGap(ArrayList<Integer> list, int limit) {

        int prev = 0;
        int ans = 0;

        for (int x : list) {
            ans = Math.max(ans, x - prev - 1);
            prev = x;
        }

        ans = Math.max(ans, limit - prev);

        return ans;
    }
}
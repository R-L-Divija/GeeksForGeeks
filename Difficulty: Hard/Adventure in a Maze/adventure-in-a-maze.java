class Solution {
    public ArrayList<Integer> findWays(int[][] grid) {

        ArrayList<Integer> p = new ArrayList<>();

        int n = grid.length;
        int m = grid[0].length;

        // dp1 -> number of ways
        // dp2 -> maximum adventure
        int dp1[][] = new int[n][m];
        int dp2[][] = new int[n][m];

        dp1[n - 1][m - 1] = 1;
        dp2[n - 1][m - 1] = grid[n - 1][m - 1];

        // for bottom row
        for (int i = m - 2; i >= 0; i--) {

            if (grid[n - 1][i] == 1 || grid[n - 1][i] == 3) {

                if (dp1[n - 1][i + 1] > 0) {
                    dp1[n - 1][i] = dp1[n - 1][i + 1];
                    dp2[n - 1][i] = grid[n - 1][i]
                                  + dp2[n - 1][i + 1];
                }

            } else {
                break;
            }
        }

        // for right column
        for (int i = n - 2; i >= 0; i--) {

            if (grid[i][m - 1] == 2 || grid[i][m - 1] == 3) {

                if (dp1[i + 1][m - 1] > 0) {
                    dp1[i][m - 1] = dp1[i + 1][m - 1];
                    dp2[i][m - 1] = grid[i][m - 1]
                                  + dp2[i + 1][m - 1];
                }

            } else {
                break;
            }
        }

        // to fill remaining cells
        for (int i = n - 2; i >= 0; i--) {

            for (int j = m - 2; j >= 0; j--) {

                // Move Right
                if (grid[i][j] == 1) {

                    if (dp1[i][j + 1] > 0) {

                        dp1[i][j] = dp1[i][j + 1];

                        dp2[i][j] = grid[i][j]
                                  + dp2[i][j + 1];
                    }
                }

                // Move Down
                if (grid[i][j] == 2) {

                    if (dp1[i + 1][j] > 0) {

                        dp1[i][j] = dp1[i + 1][j];

                        dp2[i][j] = grid[i][j]
                                  + dp2[i + 1][j];
                    }
                }

                if (grid[i][j] == 3) {

                    boolean right = dp1[i][j + 1] > 0;
                    boolean down = dp1[i + 1][j] > 0;

                    if (!right && !down) {
                        continue;
                    }
                    // Number of paths
                    dp1[i][j] = (dp1[i][j + 1]
                              + dp1[i + 1][j]) % 1000000007;;

                    // Maximum Adventure
                    if (dp2[i][j + 1] >= dp2[i + 1][j]) {

                        if (right) {
                            dp2[i][j] = grid[i][j]
                                      + dp2[i][j + 1];
                        }

                    } else {

                        if (down) {
                            dp2[i][j] = grid[i][j]
                                      + dp2[i + 1][j];
                        }
                    }
                }
            }
        }

        p.add(dp1[0][0]);
        p.add(dp2[0][0]);

        return p;
    }
}
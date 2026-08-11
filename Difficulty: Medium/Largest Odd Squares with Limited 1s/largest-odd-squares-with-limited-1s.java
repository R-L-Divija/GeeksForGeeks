class Solution {
    ArrayList<Integer> largestSquare(int[][] mat, int[][] queries, int k) {
        int n = mat.length;
        int m = mat[0].length;
         ArrayList<Integer> q=new ArrayList<>();
        int[][] p = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                p[i][j] =
                        mat[i - 1][j - 1]
                        + p[i - 1][j]
                        + p[i][j - 1]
                        - p[i - 1][j - 1];
            }
        }
        for( int x[]:queries){
            int r=x[0];
            int c=x[1];
            
            int mind=Math.min(Math.min(r,c),Math.min(n-r-1,m-c-1));
            int ans=-1;
            
            for(int i=0;i<=mind;i++){
                int r1=r-i+1;
                int c1=c-i+1;
                int r2=r+i+1;
                int c2=c+i+1;
                
                
                int one=p[r2][c2]-p[r1-1][c2]-p[r2][c1-1]+p[r1-1][c1-1];
                
                if(one>k)break;
                ans=2*i+1;
            }
            q.add(ans);
        }
return q;
    }
}
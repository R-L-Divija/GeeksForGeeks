class Solution {
    public int minFallingPathSum(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
       int dp[][]=new int[n][m];
      
       for(int i=0;i<m;i++){
        dp[0][i]=mat[0][i];
       }
       for(int i=1;i<n;i++){
           for(int j=0;j<m;j++){
              int m1=0;
              int m2=Integer.MAX_VALUE;
              int m3=Integer.MAX_VALUE;
              int min=Integer.MAX_VALUE;
                 m1=dp[i-1][j]+mat[i][j];
               if( j+1<m){
                   m2=dp[i-1][j+1]+mat[i][j];
               }if(j-1>=0){
                   m3=dp[i-1][j-1]+mat[i][j];
               }
               min=Math.min(m1,m2);
               min=Math.min(min,m3);
               dp[i][j]=min;
           }}
           int ans=Integer.MAX_VALUE;
       for(int i=0;i<m;i++){
           ans=Math.min(ans,dp[n-1][i]);
       }
      
        return ans;
    }
}

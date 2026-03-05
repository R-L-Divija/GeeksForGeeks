class Solution {
    public int maximumPoints(int mat[][]) {
        int n=mat.length;
        int m=mat[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<m;i++){
            dp[0][i]=mat[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int m1=Integer.MAX_VALUE;
                
                if(j==0){
                dp[i][j]=mat[i][j]+Math.max(dp[i-1][j+1],dp[i-1][j+2]);
                }else if(j==1){
                    dp[i][j]=mat[i][j]+Math.max(dp[i-1][j-1],dp[i-1][j+1]);
                }else if(j==2){
                    dp[i][j]=mat[i][j]+Math.max(dp[i-1][j-1],dp[i-1][j-2]);
                }
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            ans=Math.max(ans,dp[n-1][i]);
        }
        return ans;
    }
}
class Solution {
    public int maxGold(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            dp[i][0]=mat[i][0];
        }
        for(int j=1;j<m;j++){
            for(int i=0;i<n;i++){
                int m1=-1;
                if(i==0){
                    m1=mat[i][j]+Math.max(dp[i][j-1],dp[i+1][j-1]);
                }
                else if(i==n-1){
                     m1=mat[i][j]+Math.max(dp[i][j-1],dp[i-1][j-1]);
                }else{
                    m1=mat[i][j]+Math.max(dp[i+1][j-1],Math.max(dp[i][j-1],dp[i-1][j-1]));
                }
                dp[i][j]=m1;
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,dp[i][m-1]);
        }
        return ans;
    }
}
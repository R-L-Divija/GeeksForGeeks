// User function Template for Java

class Solution {
    int minCost(int[][] colors, int N) {
        // Write your code here
        int dp[][]=new int[N][4];
        for(int i=0;i<3;i++){
            dp[0][i]=colors[0][i];
        }
        
        for(int i=1;i<N;i++){
            for(int j=0;j<3;j++){
                if(j==0){
                    dp[i][j]=Math.min(dp[i-1][j+1]+colors[i][j],dp[i-1][j+2]+colors[i][j]);
                }
                else if(j==1){
                dp[i][j]=Math.min(dp[i-1][j+1]+colors[i][j],dp[i-1][j-1]+colors[i][j]);
                }
                else if(j==2){
                    dp[i][j]=Math.min(dp[i-1][j-1]+colors[i][j],dp[i-1][j-2]+colors[i][j]);
                }
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            ans=Math.min(ans,dp[N-1][i]);
        }
        return ans;
    }
}
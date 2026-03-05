// User function Template for Java

class Solution {
    public int totalWays(int N, int M, int grid[][]) {
        int mod=(int)1e9+7;
        int dp[][]=new int[N][M];
      
        if(grid[0][0]==1||grid[N-1][M-1]==1)return 0;
        
        for(int i=M-1;i>=0;i--){
            if(grid[N-1][i]==1)break;
            dp[N-1][i]=1;
            
        }
         for(int i=N-1;i>=0;i--){
             if(grid[i][M-1]==1)break;
              dp[i][M-1]=1;
             
        }
        for(int i=N-2;i>=0;i--){
            for(int j=M-2;j>=0;j--){
                if(grid[i][j]==1){
                   continue; 
                }
                dp[i][j]=(dp[i+1][j]+dp[i][j+1])%mod;
            }
        }
        return dp[0][0];
    }
}
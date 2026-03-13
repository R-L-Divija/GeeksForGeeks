class Solution {
    //   int dp[]=new int[100];
    int countWays(int n) {
    //   if(n==0||n==1)return 1;
    //   if(dp[n]!=0)return dp[n];
    //   return dp[n]=countWays(n-1)+countWays(n-2);
        
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}

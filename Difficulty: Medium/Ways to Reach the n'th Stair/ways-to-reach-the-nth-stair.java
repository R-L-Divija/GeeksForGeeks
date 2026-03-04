class Solution {
      int dp[]=new int[100];
    int countWays(int n) {
      
       if(n==0||n==1)return 1;
       if(dp[n]!=0)return dp[n];
       return dp[n]=countWays(n-1)+countWays(n-2);
        
    }
}

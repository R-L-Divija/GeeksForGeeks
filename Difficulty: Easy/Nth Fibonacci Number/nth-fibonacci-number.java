class Solution {
    public int nthFibonacci(int n) {
    //   int dp[]=new int[n+1];
    //   if(n<=1)return n;
    //   if(dp[n]!=0)return dp[n];
    //   return dp[n]=nthFibonacci(n-1)+nthFibonacci(n-2);
      
    // int dp[]=new int[n+1];
    
    // if(n<=1)return n;
    // dp[0]=0;
    // dp[1]=1;
    // for(int i=2;i<=n;i++){
    //     dp[i]=dp[i-1]+dp[i-2];
    // }
    // return dp[n];
    
    
    
   
    if(n<=1)return n;
    int dp[]=new int[n+1];
    Arrays.fill(dp,0);
    dp[0]=0;
    dp[1]=1;
    for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
    }
}
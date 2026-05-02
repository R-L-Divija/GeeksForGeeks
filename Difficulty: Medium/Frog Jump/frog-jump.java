class Solution {
    int minCost(int[] h) {

        int n=h.length;
        if(n==1)return 0;
        if(n==2)return Math.abs(h[0]-h[1]);
       int dp[]=new int[n+1];
       dp[0]=0;
       dp[1]=Math.abs(h[0]-h[1]);
       for(int i=2;i<n;i++){
           int m1=Math.abs(h[i-1]-h[i])+dp[i-1];
           int m2=Math.abs(h[i]-h[i-2])+dp[i-2];
           dp[i]=Math.min(m1,m2);
       }
        return dp[n-1];
    }
}
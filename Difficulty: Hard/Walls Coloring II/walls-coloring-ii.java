class Solution {
    int minCost(int[][] costs) {
        int n=costs.length;
        int m=costs[0].length;
       
        if(n==1&&m==1)return costs[0][0];
        if(n>1&&m==1)return -1;
       int dp[][]=new int[n][m];
       for(int i=0;i<m;i++){
           dp[0][i]=costs[0][i];
       }
       for(int i=1;i<n;i++){
           for(int j=0;j<m;j++){
               int m1=Integer.MAX_VALUE;
               for(int k=0;k<m;k++){
                   if(j!=k){
                   m1=Math.min(m1,dp[i-1][k]);
                   }
                 
               }
                 dp[i][j]=m1+costs[i][j];
           }
       }
       int ans=Integer.MAX_VALUE;
       for(int i=0;i<m;i++){
           ans=Math.min(ans,dp[n-1][i]);
       }
       if(ans==Integer.MAX_VALUE)return -1;
       return ans;
    }
}
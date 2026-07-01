class Solution {
        
        public int solve(int i,int s,int tar,int a[],int dp[][]){
        if(i==a.length){
            return (s==tar)?1:0;
        }
        if(dp[i][s]!=-1)return dp[i][s];
        int t=0;
        if(s+a[i]<=tar){
         t=solve(i+1,s+a[i],tar,a,dp);
        }
        int nt=solve(i+1,s,tar,a,dp);
        return dp[i][s]=t+nt;
    }
    public int countPartitions(int[] arr, int diff) {
      int s=0;
      for(int x:arr){
          s+=x;     
          }
      if((s+diff)%2!=0)return 0;
      int t=(s+diff)/2;
       
        int dp[][]=new int[arr.length+1][t+1];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,t,arr,dp);
      
        
    }
}

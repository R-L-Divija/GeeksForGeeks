class Solution {
    public int func(int i,int w[],int v[],int s,int dp[][]){
       if(s==0)return 0;
       if(s<0)return Integer.MIN_VALUE;
       if(i==w.length){
            return 0;
        }
        if(dp[i][s]!=-1)return dp[i][s];
        int t=v[i]+func(i,w,v,s-w[i],dp);
        
        int nt=func(i+1,w,v,s,dp);
        return dp[i][s]=Math.max(nt,t);
    }
    public int knapSack(int val[], int wt[], int capacity) {
        int dp[][]=new int[wt.length][capacity+1];
        for(int i=0;i<wt.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(0,wt,val,capacity,dp);
        
    }
}
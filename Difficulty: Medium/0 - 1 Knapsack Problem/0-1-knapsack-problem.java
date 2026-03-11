class Solution {
    
    public int func(int index,int W,int wt[],int[] val,int dp[][]){
       
        if(W<0)return Integer.MIN_VALUE;
        if(index==wt.length)return 0;
        if(dp[index][W]!=-1)return dp[index][W];
        //take
        int t=val[index]+func(index+1,W-wt[index],wt,val,dp);
        //not take
        int nt=func(index+1,W,wt,val,dp);
        
        return dp[index][W]=Math.max(t,nt);
        
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
         int dp[][]=new int[wt.length+1][W+1];
         for(int i=0;i<wt.length;i++){
             Arrays.fill(dp[i],-1);
         }
          return func(0,W,wt,val,dp);
     
    
    }
}

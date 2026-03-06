class Solution {
    public int func(int index, int val[],int wt[],int t,int dp[][]){
        if(t==0) return 0;
        if(t<0)return Integer.MIN_VALUE;
        if(index==wt.length){
            return 0;
        }
        if(dp[index][t]!=-1)return dp[index][t];
        //take
        int m1=val[index]+func(index,val,wt,t-wt[index],dp);
        //not take
        int m2= func(index+1,val,wt,t,dp);
        
        return dp[index][t]=Math.max(m1,m2);
    }
    public int knapSack(int val[], int wt[], int t) {
        // code here
        
       int dp[][]=new int[val.length][t+1];
       for(int i=0;i<val.length;i++){
           Arrays.fill(dp[i],-1);
       }
        return func(0,val,wt,t,dp);
        
    }
}
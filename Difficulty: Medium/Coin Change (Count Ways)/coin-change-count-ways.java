class Solution {
    public int func(int i,int a[],int t,int dp[][]){
        if(i==a.length){
            if(t==0)return 1;
            return 0;
        }
        if(t<0)return 0;
        if(dp[i][t]!=-1)return dp[i][t];
        
        int ta=func(i,a,t-a[i],dp);
        int nt=func(i+1,a,t,dp);
        return dp[i][t]=ta+nt;
    }
    public int count(int coins[], int sum) {
        int dp[][]=new int[coins.length][sum+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
       return func(0,coins,sum,dp);
    }
}
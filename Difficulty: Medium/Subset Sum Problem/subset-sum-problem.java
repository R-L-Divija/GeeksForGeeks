class Solution {


    public static int solve(int i,int s,int arr[],int t,int dp[][]){
        if(i==arr.length){
            return (s==t)? 1:0;
        }
        if(dp[i][s]!=-1)return dp[i][s];
        int ta=0;
        if(s+arr[i]<=t){
            ta=solve(i+1,s+arr[i],arr,t,dp);
        }
        int nt=solve(i+1,s,arr,t,dp);
        return dp[i][s]=ta+nt;
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        int dp[][]=new int[arr.length][sum+1];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int x=solve(0,0,arr,sum,dp);
        return x!=0?true:false;
        
    }
}
// User function Template for Java

class Solution {
    int func(int index,int n,int arr[],int dp[]){
        
        if(index==n-1)return arr[index];
        if(index>n-1)return 0;
        int sum=0;
        if(dp[index]!=-1)return dp[index];
        //take
        sum+=arr[index];
        int m1=sum+func(index+2,n,arr,dp);
        //not take
        sum-=arr[index];
        int m2=sum+func(index+1,n,arr,dp);
        return dp[index]=Math.max(m1,m2);
    }
    int findMaxSum(int arr[]) {
     int dp[]=new int[arr.length+1];
     Arrays.fill(dp,-1);
    return func(0,arr.length,arr,dp);
        
    }
}
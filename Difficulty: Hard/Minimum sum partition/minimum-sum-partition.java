// User function Template for Java

class Solution {
    public int func(int i,int s1,int s,int []arr,int dp[][]){
        if(i==arr.length){
            int s2=s-s1;
            return Math.abs(s1-s2);
        }
        if(dp[i][s1]!=-1)return dp[i][s1];
        int t=func(i+1,s1+arr[i],s,arr,dp);
        int nt=func(i+1,s1,s,arr,dp);
        return dp[i][s1]=Math.min(t,nt);
    }
    public int minDifference(int arr[]) {
        int s=0;
       for(int x:arr){
           s+=x;
       }
       int dp[][]=new int[arr.length][s+1];
       for(int i=0;i<arr.length;i++){
           Arrays.fill(dp[i],-1);
       }
       return func(0,0,s,arr,dp);
    }
}

// User function Template for Java

class Solution {
    
    public int func(int index,int s1,int s,int[] arr,int dp[][]){
        
        if(index==arr.length){
            int s2=s-s1;
             return Math.abs(s1-s2);
           
        }
        if(dp[index][s1]!=-1)return dp[index][s1];
        int t=func(index+1,s1+arr[index],s,arr,dp);
        int nt=func(index+1,s1,s,arr,dp);
        return dp[index][s1]=Math.min(t,nt);
        
    }
    public int minDifference(int arr[]) {
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        int dp[][]=new int[arr.length+1][sum+1];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
         return func(0,0,sum,arr,dp);
         
    }
}

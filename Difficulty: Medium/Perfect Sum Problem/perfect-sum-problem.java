class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] arr, int target) {
       
        // code here
     int n=arr.length;
     int dp[][]=new int[n][target+1];
   
     //step 2
     if(arr[n-1]==0){
         dp[n-1][0]=2;
     }
     else dp[n-1][0]=1;
     
     if(arr[n-1]!=0&&arr[n-1]<=target){
         dp[n-1][arr[n-1]]=1;
     }
     //step3
     for(int i=n-2;i>=0;i--){
         for(int j=0;j<=target;j++){
             //not take
             int nt=dp[i+1][j];
             //take
             int t=0;
             if(j-arr[i]>=0){
             t=dp[i+1][j-arr[i]];
             }
             dp[i][j]=t+nt;
         }
     }
     return dp[0][target];
    }
}

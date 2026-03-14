class Solution {
  
    // static boolean func(int index,int arr[],int s,int dp[][]){
        
    //     if(index==arr.length){
    //          if(s==0)return true;
    //         return false;
    //     }
    //     if(s<0)return false;
    //     //take
        
    //   if(dp[index][s]!=-1) return dp[index][s]==1;
    //   boolean t1= func(index+1,arr,s-arr[index],dp);
      
    //     boolean t2=func(index+1,arr,s,dp);
        
    //     dp[index][s]=(t1||t2)?1:0;
        
    //     return dp[index][s]==1;
    // }
        
        
    // static Boolean isSubsetSum(int arr[], int sum) {
    //     // code here
    //     int dp[][]=new int[arr.length][sum+1];
    //     for(int i=0;i<arr.length;i++){
    //     Arrays.fill(dp[i],-1);
    //     }
        
    //     return func(0,arr,sum,dp);
        
    // }
    // static Boolean isSubsetSum(int arr[], int sum) {
    //     int n=arr.length;
    //     boolean dp[][]=new boolean[n][sum+1];
    //     //step 1
    //     for(int i=0;i<n;i++){
    //         dp[i][0]=true;
    //     }
    //     //step2
    //     if(arr[n-1]<=sum){
    //         dp[n-1][arr[n-1]]=true;
    //     }
    //     //step3
    //     for(int i=n-2;i>=0;i--){
    //         for(int j=0;j<=sum;j++){
    //             //not take
    //             boolean nt=dp[i+1][j];
    //             //take
    //             boolean t=false;
    //             if(j-arr[i]>=0){
    //                 t=dp[i+1][j-arr[i]];
    //             }
                
    //             dp[i][j]=(t||nt);
    //         }
    //     }
        
        
        
        
    //     return dp[0][sum];
        
        
        
        
        
    // }
    
    
static boolean func(int i,int arr[],int s,int dp[][]){
   
    if(i==arr.length){
        if(s==0)return true;
        return false;
    }
 
    if(s<0)return false;
      if(dp[i][s]!=-1)return dp[i][s]==1;
    boolean t=func(i+1,arr,s-arr[i],dp);
    boolean nt=func(i+1,arr,s,dp);
    dp[i][s]=(t||nt)?1:0;
    return dp[i][s]==1;
}
     static Boolean isSubsetSum(int arr[], int sum) {
       int n=arr.length;
       int dp[][]=new int[arr.length][sum+1];
       for(int i=0;i<arr.length;i++){
           Arrays.fill(dp[i],-1);
       }
       return func(0,arr,sum,dp);
     }
}
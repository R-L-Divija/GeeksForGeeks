class Solution {
    public int func(int i,int arr[],int t,int dp[][]){
        if(i==arr.length){
            if(t==0)return 1;
            return 0;
        }
        if(t<0)return 0;
        if(dp[i][t]!=-1)return dp[i][t];
        int ta=func(i+1,arr,t-arr[i],dp);
        int nt=func(i+1,arr,t,dp);
        return dp[i][t]= ta+nt;
    }
    public int countPartitions(int[] arr, int diff) {
    // int n=arr.length;
    //   int s=0;
    //   for(int i=0;i<n;i++){
    //       s+=arr[i];
    //   }
    //   if((s+diff)%2!=0)return 0;
    //   int t=(s+diff)/2;
    //   int dp[][]=new int[n][t+1];
    //   //step1
    //   for(int i=0;i<n;i++){
    //       dp[i][0]=1;
    //   }
    //     //step 2
    //     if(arr[n-1]==0){
    //          dp[n-1][0]=2;
    //     }
    //     else if(arr[n-1]<=t){
    //         dp[n-1][arr[n-1]]=1;
    //     }
    //     //stp 3
    //     for(int i=n-2;i>=0;i--){
    //         for(int j=0;j<=t;j++){
    //             //not take
    //             int nt=dp[i+1][j];
    //             //take\
    //             int ta=0;
    //             if(j-arr[i]>=0){
    //             ta=dp[i+1][j-arr[i]];
    //             }
    //             dp[i][j]=ta+nt;
    //         }
    //     }
    //     return dp[0][t];
    int s=0;
    for(int x:arr){
        s+=x;
    }
    int t=s+diff;
    if(t%2!=0)return 0;
    int dp[][]=new int[arr.length][t+1];
    for(int i=0;i<arr.length;i++){
        Arrays.fill(dp[i],-1);
    }
    return func(0,arr,t/2,dp);
    }
}

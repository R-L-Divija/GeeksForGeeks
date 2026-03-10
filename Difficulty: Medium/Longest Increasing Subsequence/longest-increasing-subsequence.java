class Solution {
    static int func(int i,int[] arr,int dp[]){
        if(dp[i]!=-1)return dp[i];
        int ans=1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                ans=Math.max(ans,1+func(j,arr,dp));
            }
        }
        return dp[i]=ans;
    }
    static int lis(int arr[]) {
        
    int n=arr.length;
    int dp[]=new int[n+1];
    Arrays.fill(dp,-1);
    int ans=0;
    for(int i=0;i<n;i++){
     ans=Math.max(ans,func(i,arr,dp));
    }
       return ans; 
    }
}
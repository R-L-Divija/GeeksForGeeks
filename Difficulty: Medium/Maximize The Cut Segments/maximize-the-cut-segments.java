// User function Template for Java

class Solution {
    // Function to find the maximum number of cuts.
   
    public int func(int index,int arr[],int target,int dp[][]){
       
            if(target==0){
            return 0;}
        if(target<0||index==arr.length)return Integer.MIN_VALUE;
        if(dp[index][target]!=Integer.MIN_VALUE)return dp[index][target];
        //take
        int t=1+func(index,arr,target-arr[index],dp);
        //not take
        int nt=func(index+1,arr,target,dp);
        return dp[index][target]=Math.max(t,nt);
     
        
    }
    public int maximizeCuts(int n, int x, int y, int z) {
        // Your code here
        int arr[]={x,y,z};
        int dp[][]=new int[arr.length+1][n+1];
        for(int i=0;i<3;i++){
           Arrays.fill(dp[i],Integer.MIN_VALUE); 
        }
        int ans=func(0,arr,n,dp);
        if(ans<0)return 0;
        return ans;
    }
}

class Solution {
    // Function to calculate the number of subsets with a given sum
    public int solve(int i,int s,int a[],int t,int dp[][]){
       
        if(i==a.length){
            return (s==t)?1:0;
        }
        if(dp[i][s]!=-1)return dp[i][s];
        int ta=0;
        if(s+a[i]<=t){
        
        ta=solve(i+1,s+a[i],a,t,dp);
        }
       
        int nt=solve(i+1,s,a,t,dp);
        return dp[i][s]=ta+nt;
    }
    public int perfectSum(int[] nums, int target) {
        int dp[][]=new int[nums.length+1][target+1];
        for(int i=0;i<nums.length;i++){
        Arrays.fill(dp[i],-1);
        }
      return solve(0,0,nums,target,dp);
        
    }
}
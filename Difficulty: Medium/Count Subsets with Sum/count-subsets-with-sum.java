class Solution {
    public static int c;
    public static int  func(int index,int arr[],int s,int t,int dp[][]){
        
        
       
        if(index==arr.length){
         if(s==t){
            return 1;
            
        }
           
          return 0;
        }
        if(dp[index][s]!=-1)return dp[index][s];
        int ta=0;
        if(s+arr[index]<=t){
       ta= func(index+1,arr,s+arr[index],t,dp);}
       int nt= func(index+1,arr,s,t,dp);
       return dp[index][s]=ta+nt;
        
        
    }
    static int perfectSum(int[] arr, int target) {
        // code here
        int dp[][]=new int[arr.length][target+1];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        c=0;
        c=func(0,arr,0,target,dp);
        return c;
        
        
    }
}
class Solution {
  
    static boolean func(int index,int arr[],int s,int dp[][]){
        
        if(index==arr.length){
             if(s==0)return true;
            return false;
        }
        if(s<0)return false;
        //take
        
       if(dp[index][s]!=-1) return dp[index][s]==1;
       boolean t1= func(index+1,arr,s-arr[index],dp);
      
        boolean t2=func(index+1,arr,s,dp);
        
        dp[index][s]=(t1||t2)?1:0;
        
        return dp[index][s]==1;
    }
        
        
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int dp[][]=new int[arr.length][sum+1];
        for(int i=0;i<arr.length;i++){
        Arrays.fill(dp[i],-1);
        }
        
        return func(0,arr,sum,dp);
        
    }
}
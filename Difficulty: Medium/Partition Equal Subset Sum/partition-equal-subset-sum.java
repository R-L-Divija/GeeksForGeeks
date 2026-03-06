class Solution {
    // static boolean func(int index,int arr[],int t,int dp[][]){
    //     if(arr.length==index){
    //         if(t==0)return true;
    //         return false;
    //     }
    //     if(t<0)return false;
    //   if(dp[index][t]!=-1)return dp[index][t]==1;
    //     //take
    //   boolean ta= func(index+1,arr,t-arr[index],dp);
    //     //not take
    //   boolean nt=func(index+1,arr,t,dp);
        
    //  dp[index][t]=(ta||nt)?1:0;
    //   return dp[index][t]==1;
        
    // }
    // static boolean equalPartition(int arr[]) {
    //     // code here
    //     int s=0;
    //     for(int i=0;i<arr.length;i++){
    //         s+=arr[i];
    //     }
    //     if(s%2!=0){
    //         return false;
    //     }
    //     int tar=s/2;
    //      int dp[][]=new int[arr.length][tar+1];
    //      for(int i=0;i<arr.length;i++){
    //          Arrays.fill(dp[i],-1);
    //      }
    //     return func(0,arr,tar,dp);
    // }
    
    static boolean func(int index,int arr[],int s,int dp[][]){
        if(index==arr.length){
            if(s==0)return true;
            return false;
        }
        if(s<0)return false;
        
        if(dp[index][s]!=-1)return dp[index][s]==1;
        //take
        boolean t=func(index+1,arr,s-arr[index],dp);
        //not take
        boolean nt =func(index+1,arr,s,dp);
        dp[index][s]=(t||nt)?1:0;
        return dp[index][s]==1;
    }
    static boolean equalPartition(int arr[]) {
       
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        if(s%2!=0)return false;
        int tar=s/2;
         int dp[][]=new int[arr.length][tar+1];
         for(int i=0;i<arr.length;i++){
             Arrays.fill(dp[i],-1);
         }
        return func(0,arr,tar,dp);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
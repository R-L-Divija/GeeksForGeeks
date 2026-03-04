class Solution {

    // int func(int index,int n,int[]dp,int h[]){
    //   // if(n==1)return 0;
    //     if(index==n-1)return 0;
    //     int m1=Integer.MAX_VALUE;
    //     int m2=Integer.MAX_VALUE;
    //      if(dp[index]!=0)return dp[index];
    //     if(index+1<n){
    //      m1=Math.abs(h[index]-h[index+1])+func(index+1,n,dp,h);
    //     }if(index+2<n){
    //      m2=Math.abs(h[index]-h[index+2])+func(index+2,n,dp,h);
    //     }
       
    //     return dp[index]=Math.min(m1,m2);
        
        
    // }
    int minCost(int[] h) {
        // code here
        // int n=h.length;
        // int dp[]=new int[n+100];
        // return func(0,n,dp,h);
        
        
        //tabulation
        int n=h.length;
        int dp[]=new int[n+1];
        if(n==1)return 0;
    dp[0]=0;
    
    dp[1]=Math.abs(h[0]-h[1]);
    
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MAX_VALUE;
        
        for(int i=2;i<n;i++){
           
            m1=Math.abs(h[i]-h[i-1])+dp[i-1];
            
            m2=Math.abs(h[i]-h[i-2])+dp[i-2];
            
            dp[i]=Math.min(m1,m2);
        }
        return dp[n-1];
    }
}
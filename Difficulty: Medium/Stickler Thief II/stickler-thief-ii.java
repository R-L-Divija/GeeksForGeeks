class Solution {
    public int fun(int arr[],int s,int e){
        int n=e-s+1;
        int dp[]=new int[n+1];
        
        dp[0]=arr[s];
        if (n>1){
        dp[1]=Math.max(arr[s],arr[s+1]);}
        
        for(int i=2;i<n;i++){
            int m1=arr[s+i]+dp[i-2];
            dp[i]=Math.max(dp[i-1],m1);
        }
        return dp[n-1];
    }
    
    
    public int maxValue(int[] arr) {
        // code here
        if(arr.length==1)return arr[0];
        if(arr.length==2)return Math.max(arr[0],arr[1]);
        int m1=fun(arr,0,arr.length-2);
        int m2=fun(arr,1,arr.length-1);
        return Math.max(m1,m2);
    }
}

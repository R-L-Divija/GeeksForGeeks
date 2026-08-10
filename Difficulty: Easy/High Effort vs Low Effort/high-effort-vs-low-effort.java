class Solution {
    public int maxTask(int[] h, int[] l) {
        // code here
        int dp[]=new int[h.length+1];
        
        
        dp[0]=Math.max(h[0],l[0]);
        for(int i=1;i<h.length;i++){
    
            if(i<2){
            if(h[i]>dp[i-1]+l[i]){
                dp[i]=h[i];
            }else{
                dp[i]=dp[i-1]+l[i];
            }
                
            }
            
            else{
                 if(h[i]+dp[i-2]>dp[i-1]+l[i]){
                dp[i]=h[i]+dp[i-2];
            }else{
                dp[i]=dp[i-1]+l[i];
            }
            }
        }
        return dp[h.length-1];
    }
}
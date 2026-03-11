// User function Template for Java

class Solution {
  
    static boolean isP(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
    static int func(int index,String s,int dp[]){
        if(index==s.length())return 0;
        if(dp[index]!=-1)return dp[index];
           int ans=Integer.MAX_VALUE;
           
           
            for(int j=index;j<s.length();j++){
               // String sub=s.substring(index,j+1);
                if(isP(s,index,j)){
               int cost=1+func(j+1,s,dp);
              ans=Math.min(ans,cost);
                }
                }
    
        return  dp[index]=ans;
    }
    static int palPartition(String s) {
        int dp[]=new int[s.length()+1];
        Arrays.fill(dp,-1);
      return func(0,s,dp)-1;
        
    }
}
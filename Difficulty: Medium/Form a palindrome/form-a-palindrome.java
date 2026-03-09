// User function Template for Java

class Solution {
    static int func(int i,int j,String s1,String s2,int dp[][]){
        if(i==s1.length()||j==s2.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))return 1+func(i+1,j+1,s1,s2,dp);
        else{
            int m1=func(i,j+1,s1,s2,dp);
            int m2=func(i+1,j,s1,s2,dp);
            
            return dp[i][j]= Math.max(m1,m2);
        }
    }
    static int countMin(String s1) {
      int n=s1.length();
      int dp[][]=new int[n+1][n+1];
      for(int i=0;i<=n;i++){
          Arrays.fill(dp[i],-1);
      }
      String s2=new StringBuilder(s1).reverse().toString();
      return s1.length()-func(0,0,s1,s2,dp);
        
    }
}
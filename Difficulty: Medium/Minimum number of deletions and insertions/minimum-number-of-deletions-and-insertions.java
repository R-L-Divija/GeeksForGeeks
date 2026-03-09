// User function Template for Java

class Solution {
    public int func(int i,int j,String s1,String s2,int [][]dp){
        if(i==s1.length()||j==s2.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+func(i+1,j+1,s1,s2,dp);
        }else{
            int m1=func(i,j+1,s1,s2,dp);
            int m2=func(i+1,j,s1,s2,dp);
            return dp[i][j]=Math.max(m1,m2);
        }
    }
    public int minOperations(String s1, String s2) {
        // Your code goes here
        
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int diff=func(0,0,s1,s2,dp);
        return n-diff+m-diff;
    }
}
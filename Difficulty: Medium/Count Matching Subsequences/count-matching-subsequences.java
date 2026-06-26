class Solution {
    public static int mod=1000000007;
    public static long func(String s1,String s2,int i,int j,long dp[][]){
        
        if(j==s2.length())return 1;
        if(i==s1.length())return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        long r=0;
        if(s1.charAt(i)==s2.charAt(j)){
            long t=func(s1,s2,i+1,j+1,dp);
            long nt=func(s1,s2,i+1,j,dp);
             r=(t+nt)%mod;
            
        }
        else r=func(s1,s2,i+1,j,dp);
        return dp[i][j]=r;
    }
    public static int countWays(String s1, String s2) {
        long dp[][]=new long[s1.length()][s2.length()];
        for(long[] x:dp){
            Arrays.fill(x,-1);
        }
        return (int)func(s1,s2,0,0,dp);
        
    }
}

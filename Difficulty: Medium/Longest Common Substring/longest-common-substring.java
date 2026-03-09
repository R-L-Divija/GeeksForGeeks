class Solution {
    int max=Integer.MIN_VALUE;
    public int func(int i,int j,String s1,String s2,int dp[][]){
        if(i==s1.length()||j==s2.length())return 0;
        if(dp[i][j]!=Integer.MIN_VALUE)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            int l=1+func(i+1,j+1,s1,s2,dp);
            dp[i][j]=max=Math.max(max,l);
            return l;
        }
            return dp[i][j]= 0;
        
    }
    public int longCommSubstr(String s1, String s2) {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<s1.length();i++){
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                 func(i,j,s1,s2,dp);
            }
        }
       if(max==Integer.MIN_VALUE)return 0;
       return max;
    // int n=s1.length();
    // int m=s2.length();
    // int dp[][]=new int[n+1][m+1];
    // for(int i=0;i<=m;i++){
    //     dp[0][i]=0;
    // }
    // for(int j=0;j<=n;j++){
    //     dp[j][0]=0;
    // }
    // int max=0;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=m;j++){
    //         if(s1.charAt(i-1)==s2.charAt(j-1)){
                
    //             dp[i][j]=1+dp[i-1][j-1];
    //             max=Math.max(max,dp[i][j]);
    //         }else{
    //             dp[i][j]=0;
    //         }
    //     }
    // }
  
    // return max;
    }
}
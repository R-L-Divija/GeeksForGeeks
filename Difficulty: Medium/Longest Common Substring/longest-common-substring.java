class Solution {
    public int func(int i,int j,String s1,String s2){
        if(i==s1.length()||j==s2.length())return 0;
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+func(i+1,j+1,s1,s2);
        }else{
          
           int m1= func(i,j+1,s1,s2);
            int m2=func(i+1,j,s1,s2);
              return Math.max(m1,m2);
        }
    }
    public int longCommSubstr(String s1, String s2) {
    //   return func(0,0,s1,s2);
    int n=s1.length();
    int m=s2.length();
    int dp[][]=new int[n+1][m+1];
    for(int i=0;i<=m;i++){
        dp[0][i]=0;
    }
    for(int j=0;j<=n;j++){
        dp[j][0]=0;
    }
    int max=0;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                
                dp[i][j]=1+dp[i-1][j-1];
                max=Math.max(max,dp[i][j]);
            }else{
                dp[i][j]=0;
            }
        }
    }
  
    return max;
    }
}
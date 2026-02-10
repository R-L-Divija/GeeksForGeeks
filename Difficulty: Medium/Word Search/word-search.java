class Solution {
    StringBuilder temp;
     boolean[][] v;
    int dir[][]={{1,0},{0,-1},{0,1},{-1,0}};
    public boolean func(int r,int c,int index,char[][] mat,String word){
           int n=mat.length;
        int m=mat[0].length;
          if(index==word.length()){
            return true;
        }
        if(r<0||r>n-1||c<0||c>m-1||mat[r][c]!=word.charAt(index)||v[r][c])return false;
        
      
     
      v[r][c]=true;;
        for(int i=0;i<4;i++){
            int nr=r+dir[i][0];
            int nc=c+dir[i][1];
            if(func(nr,nc,index+1,mat,word))return true;
        }
        v[r][c]=false;
        return false;
        
    }
    public boolean isWordExist(char[][] mat, String word) {
          int n=mat.length;
        int m=mat[0].length;
        v=new boolean[n][m];
       temp=new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (func(i, j, 0, mat, word))
                    return true;
            }
         
        }
           return false;
    }
}
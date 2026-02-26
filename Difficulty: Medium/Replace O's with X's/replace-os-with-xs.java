class Solution {
    int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
    void func(int r,int c,int v[][],char grid[][]){
        if(r>=grid.length || r<0|| c>=grid[0].length||c<0||v[r][c]==1||grid[r][c]=='X')return;
        v[r][c]=1;
        
       for(int i=0;i<4;i++){
           int nr=r+dir[i][0];
           int nc=c+dir[i][1];
           func(nr,nc,v,grid);
       }
    }
    public void fill(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int v[][]=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(v[i],0);
        }
          for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0||j==0||i==n-1||j==m-1){
                    if(grid[i][j]=='O'&&v[i][j]==0){
                      func(i,j,v,grid);
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(v[i][j]==0&&grid[i][j]=='O'){
                    grid[i][j]='X';
                }
            }
        }
      
    }
}

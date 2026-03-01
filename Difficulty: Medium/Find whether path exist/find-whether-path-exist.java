
class Solution {
    // Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid) {
       int v[][]=new int[grid.length][grid[0].length];
       for(int i=0;i<grid.length;i++){
           Arrays.fill(v[i],0);
       }
       int dir[][]={{0,-1},{0,1},{1,0},{-1,0}};
       Queue<int[]>q=new LinkedList<>();
       for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
               if(grid[i][j]==1){
                   q.offer(new int[]{i,j});
                   v[i][j]=1;
               }
           }
       }
       while(!q.isEmpty()){
           int t[]=q.poll();
           int r=t[0];
           int c=t[1];
           if(grid[r][c]==2)return true;
           for(int k=0;k<4;k++){
              int nr=r+dir[k][0];
              int nc=c+dir[k][1];
              
              if(nr>=0&&nr<grid.length&&nc>=0&&nc<grid[0].length&&v[nr][nc]==0&&grid[nr][nc]!=0){
                  q.offer(new int[]{nr,nc});
                  v[nr][nc]=1;
              }
           }
           
       }
       return false;
        
    }
}
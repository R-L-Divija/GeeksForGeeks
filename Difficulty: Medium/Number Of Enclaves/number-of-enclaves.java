// User function Template for Java

class Solution {

    int numberOfEnclaves(int[][] grid) {
        int tot=0;
     int n=grid.length;
     int m=grid[0].length;
     int dir[][]={{-1,0},{1,0},{0,1},{0,-1}};
     for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
             if(grid[i][j]==1)
             tot++;
         }
     }
     int v[][]=new int[n][m];
     for(int i=0;i<n;i++){
         Arrays.fill(v[i],0);
     }
     Queue<int[]>q=new LinkedList<>();
     int count=0;
     for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
             if(i==0||j==0||i==n-1||j==m-1){
                 if(grid[i][j]==1 &&v[i][j]==0){
                     
                     q.offer(new int[]{i,j});
                     v[i][j]=1;
                     while(!q.isEmpty()){
                         int []t=q.poll();
                         count++;
                         int r=t[0];
                         int c=t[1];
                         for(int k=0;k<4;k++){
                             int nr=r+dir[k][0];
                             int nc=c+dir[k][1];
                             if(nr>=0&&nr<n&&nc>=0&&nc<m&&grid[nr][nc]==1&&v[nr][nc]==0){
                                 q.offer(new int[]{nr,nc});
                                 v[nr][nc]=1;
                             }
                         }
                         
                     }
                 }
             }
         }
         
     }
      return tot-count;  
    }
}
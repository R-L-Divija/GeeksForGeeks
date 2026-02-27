class Solution {
    // Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int v[][]=new int[n][m];
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{1,-1},{-1,1}};
        for(int i=0;i<n;i++){
            Arrays.fill(v[i],0);
        }
      int max=0;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1&&v[i][j]==0){
                     int count=0;
                    q.offer(new int[]{i,j});
                    v[i][j]=1;
                    while(!q.isEmpty()){
                        int t[]=q.poll();
                        int r=t[0];
                        int c=t[1];
                        count++;
                        for(int k=0;k<8;k++){
                            int nr=r+dir[k][0];
                            int nc=c+dir[k][1]; 
                    if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1 && v[nr][nc]==0){
                                q.offer(new int[]{nr,nc});
                                v[nr][nc]=1;
                            }
                        }
                    }
                    max=Math.max(max,count);
                }
            }
          
        }
          return max;
    }
    

}
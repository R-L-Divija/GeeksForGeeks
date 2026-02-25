class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        
        int n=grid.length;
        int m=grid[0].length;
        int v[][]=new int[n][m];
        int dir[][]={{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
        for(int i=0;i<n;i++){
        Arrays.fill(v[i],0);
        }
        Queue<int[]>q=new LinkedList<>();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(v[i][j]==0&&grid[i][j]=='L'){
                    count++;
                    q.offer(new int[]{i,j});
                    v[i][j]=1;
                    while(!q.isEmpty()){
                        int[] t=q.poll();
                        int r=t[0];
                        int c=t[1];
                        for(int k=0;k<8;k++){
                        int nr=r+dir[k][0];
                        int nc=c+dir[k][1];
                        if(nr>=0&&nr<n&&nc>=0&&nc<m&&v[nr][nc]==0&&grid[nr][nc]=='L'){
                            q.offer(new int[]{nr,nc});
                            v[nr][nc]=1;
                        }
                        }
                    }
                }
            }
        }
        return count;
    }
}
class Solution {
    public int orangesRot(int[][] mat) {
       int n=mat.length;
       int m=mat[0].length;
       int [][]dir={{-1,0},{1,0},{0,-1},{0,1}};
       int v[][]=new int[n][m];
       int fc=0;
       int fr=0;
       for(int i=0;i<n;i++){
           Arrays.fill(v[i],0);
       }
       Queue<int[]>q=new LinkedList<>();
       
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(mat[i][j]==2){
                   q.offer(new int[]{i,j});
                   v[i][j]=1;
                   fr++;
               }else if(mat[i][j]==1)fc++;
           }
       }
       if(fc==0)return 0;
       int count=-1;
        while(!q.isEmpty()){
            int s=q.size();
              count++;
            while(s-->0){
                int []t=q.poll();
                int r=t[0];
                int c=t[1];
                for(int k=0;k<4;k++){
                    int nr=r+dir[k][0];
                    int nc=c+dir[k][1];
                    if(nr>=0&&nr<n&&nc<m&&nc>=0&&v[nr][nc]==0&&mat[nr][nc]==1){
                        q.offer(new int[]{nr,nc});
                        v[nr][nc]=1;
                        fc--;
                    }
                }
            }
          
        }
        if(fc!=0)return -1;
        return count;
    }
}
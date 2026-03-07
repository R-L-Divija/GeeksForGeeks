class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int C) {
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        int n=image.length;
        int m=image[0].length;
        int v[][]=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(v[i],0);
        }
        if(C==image[sr][sc])return image;
       Queue<int[]>q=new LinkedList<>();
       q.offer(new int[]{sr,sc,image[sr][sc]});
       image[sr][sc]=C;
      while(!q.isEmpty()){
          int t[]=q.poll();
          int r=t[0];
          int c=t[1];
          int val=t[2];
        
          
          for(int k=0;k<4;k++){
              int nr=r+dir[k][0];
              int nc=c+dir[k][1];
              
              if(nr>=0&&nc>=0&&nr<n&&nc<m&&image[nr][nc]==val){
                  q.offer(new int[]{nr,nc,image[nr][nc]});
                  image[nr][nc]=C;
              }
          }
      }
        return image;
    }
}
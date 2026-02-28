// User function Template for Java

class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
       int dis[][]=new int[N][M];
       int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
       for(int i=0;i<N;i++){
       Arrays.fill(dis[i],Integer.MAX_VALUE);
       }
       PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
       if(A[0][0]==0)return -1;
       for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
       if(A[i][j]==1){
           if(i==0 &&j==0){
       dis[0][0]=0;
       pq.offer(new int[]{dis[i][j],i,j});
           }
       while(!pq.isEmpty()){
           int []t=pq.poll();
           int dis1=t[0];
           int r=t[1];
           int c=t[2];
           if(r==X && c==Y)return dis1;
          for(int k=0;k<4;k++){
              int nr=r+dir[k][0];
              int nc=c+dir[k][1];
              if( nr<N&&nr>=0&&nc<M&&nc>=0 &&A[nr][nc]==1 ){
                  if(dis[nr][nc]>dis1+1){
                      dis[nr][nc]=dis1+1;
                      pq.offer(new int[]{dis[nr][nc],nr,nc});
                  }
              }
          }
       }
       }
       } 
       }
       return -1;
    }
};
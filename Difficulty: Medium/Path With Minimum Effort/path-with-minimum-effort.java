class Solution {
    public int minCostPath(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int dir[][]={{0,-1},{0,1},{1,0},{-1,0}};
        int dis[][]=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dis[i],Integer.MAX_VALUE);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int t[]=pq.poll();
            int eff=t[0];
            int r=t[1];
            int c=t[2];
            if(r==n-1 &&c==m-1)return eff;
            for(int k=0;k<4;k++){
                int nr=r+dir[k][0];
                int nc=c+dir[k][1];
                
                if(nr<n &&nr>=0&&nc<m&&nc>=0){
                    int neff=Math.max(eff,Math.abs(mat[nr][nc]-mat[r][c]));
                    if(neff<dis[nr][nc]){
                        dis[nr][nc]=neff;
                        pq.offer(new int[]{neff,nr,nc});
                    }
                }
            }
        }
       
        return dis[n-1][m-1];
    }
}

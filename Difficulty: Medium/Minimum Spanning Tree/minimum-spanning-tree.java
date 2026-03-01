class Solution {
    public int spanningTree(int V, int[][] edges) {
        ArrayList<ArrayList<int []>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int x=edges[i][0];
             int y=edges[i][1];
              int wt=edges[i][2];
              adj.get(x).add(new int[]{y,wt});
              adj.get(y).add(new int[]{x,wt});
        }
        int v[]=new int[V];
        Arrays.fill(v,0);
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0,0});
        //v[0]=1;
        int sum=0;
        while(!pq.isEmpty()){
            int[] t=pq.poll();
            int wt=t[0];
            int val=t[1];
            if(v[val]==0){
             sum+=wt;
            v[val]=1;
            }else continue;
            for(int[] x:adj.get(val)){
                int y=x[0];
                int wt1=x[1];
                if(v[y]==0){
                    pq.offer(new int[]{wt1,y});
                }
            }
        }
        return sum;
    }
}

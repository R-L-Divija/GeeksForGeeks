class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
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
        int dis[]=new int[V];
        Arrays.fill(dis,Integer.MAX_VALUE);
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        dis[src]=0;
        pq.offer(new int[]{0,src});
        while(!pq.isEmpty()){
            int[] t=pq.poll();
            int dis1=t[0];
            int node=t[1];
            if(dis[node]<dis1)continue;
            for(int[] x:adj.get(node)){
                int val=x[0];
                int wt=x[1];
                if(dis1+wt<dis[val]){
                    dis[val]=dis1+wt;
                    pq.offer(new int[]{dis[val],val});
                }
            }
        }
        return dis;
    }
}
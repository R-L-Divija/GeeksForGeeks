class Solution {
    public int[] shortestPath(int V, int[][] edges, int src) {
       ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
       for(int i=0;i<V;i++){
           adj.add(new ArrayList<>());
       }
       int v[]=new int[V];
       Arrays.fill(v,0);
       int d[]=new int[V];
       Arrays.fill(d,-1);
       for(int i=0;i<edges.length;i++){
           int x=edges[i][0];
           int y=edges[i][1];
           adj.get(x).add(y);
           adj.get(y).add(x);
       }
        Queue<Integer>q=new LinkedList<>();
        q.offer(src);
        v[src]=1;
        int c=0;
    
        while(!q.isEmpty()){
            int s=q.size();
           
            while(s-->0){
                int val=q.poll();
                d[val]=c;
                for(int x:adj.get(val)){
                    if(v[x]==0){
                        q.offer(x);
                        v[x]=1;
                    }
                }
            }
            c++;
        }
        return d;
    }
}

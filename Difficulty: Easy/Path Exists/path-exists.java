class Solution {
    public boolean checkPath(int V, int[][] edges, int src, int dest) {
        // Code here
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int x=edges[i][0];
            int y=edges[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        int v[]=new int[V];
        Arrays.fill(v,0);
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        q.offer(src);
        v[src]=1;
        while(!q.isEmpty()){
            int val=q.poll();
            if(val==dest)return true;;
            for(int x:adj.get(val)){
                if(v[x]==0){
                    q.offer(x);
                    v[x]=1;
                }
            }
        }
        return false;
    }
}

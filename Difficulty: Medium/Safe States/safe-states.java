class Solution {
    public ArrayList<Integer> safeNodes(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        int out[]=new int[V];
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int x=edges[i][0];
            int y=edges[i][1];
            out[x]++;
            adj.get(y).add(x);
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(out[i]==0)q.offer(i);
        }
        if(q.isEmpty())return ans;
        while(!q.isEmpty()){
            int val=q.poll();
            ans.add(val);
            for(int x:adj.get(val)){
                out[x]--;
                if(out[x]==0)q.offer(x);
            }
        }
        Collections.sort(ans);
        return ans;
        
    }
}
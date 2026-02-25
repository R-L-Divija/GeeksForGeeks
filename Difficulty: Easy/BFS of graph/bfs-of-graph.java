class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V=adj.size();
        int v[]=new int[V];
        Arrays.fill(v,0);
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        q.offer(0);
        v[0]=1;
        while(!q.isEmpty()){
            int val=q.poll();
            ans.add(val);
           
            for(int x:adj.get(val)){
                if(v[x]==0){
                    q.add(x);
                    v[x]=1;
                }
            }
        }
        return ans;
    }
}
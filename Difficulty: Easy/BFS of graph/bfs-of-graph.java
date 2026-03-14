class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
       ArrayList<Integer>ans=new ArrayList<>();
       Queue<Integer>q=new LinkedList<>();
        int v[]=new int [adj.size()];
       q.offer(0);
      v[0]=1;
       while(!q.isEmpty()){
               int t=q.poll();
               ans.add(t);
               for(int x:adj.get(t)){
                   if(v[x]==0){
                       q.offer(x);
                       v[x]=1;
                   }
           }
       }
       return ans;
    }
}
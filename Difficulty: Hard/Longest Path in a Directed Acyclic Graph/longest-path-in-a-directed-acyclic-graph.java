class Solution {
    public int[] maxDistance(int V, int src, ArrayList<ArrayList<Integer>> edges) {
        
      ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
      for(int i=0;i<V;i++){
          adj.add(new ArrayList<>());
      }
      int in[]=new int[V];
      for(ArrayList<Integer> ed:edges){
          int u=ed.get(0);
          int v=ed.get(1);
          int wt=ed.get(2);
          
          adj.get(u).add(new int[]{v,wt});
      }
      for(int i=0;i<V;i++){
          for(int[] e:adj.get(i)){
              int v=e[0];
              in[v]++;
          }
      }
      
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(in[i]==0){
                q.add(i);
                
            }
        }
        
        while(!q.isEmpty()){
            int t=q.poll();
            ans.add(t);
            
            for(int e[]:adj.get(t)){
                int v=e[0];
                in[v]--;
                if(in[v]==0){
                    q.add(v);
                }
            }
        }
        
        int dp[]=new int[V];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[src]=0;
       for(int u:ans){
           if(dp[u]==Integer.MIN_VALUE)continue;
           
           for(int e[]:adj.get(u)){
               int v=e[0];
               int wt=e[1];
               
               dp[v]=Math.max(dp[v],dp[u]+wt);
           }
       }
        
        
        return dp;
        
    }
}

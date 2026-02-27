class Solution {
    public boolean isCycle(int V, int[][] edges) {
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
    //   if(V>=adj.size())return true;
    //   else return false;
      int v[]=new int[V];
      Arrays.fill(v,0);
     
    
      for(int i=0;i<V;i++){
        if(v[i]==0){
      Queue<int[]>q=new LinkedList<>();
       q.offer(new int[]{i,-1});
       v[i]=1;
       
        while(!q.isEmpty()){
          int t[]=q.poll();
          int val=t[0];
          int prev=t[1];
          for(int x:adj.get(val)){
              if(v[x]==0){
              q.offer(new int[]{x,val});  
              v[x]=1;
              }
              else if( prev!=x){
                  return true;
              }
          }
        
      }
          }
      }
       return false;
    }
}
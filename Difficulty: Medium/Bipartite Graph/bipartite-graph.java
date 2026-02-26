class Solution {
    boolean ans=true;
    void func(int index,int c,ArrayList<ArrayList<Integer>>adj,int[] d){
       
        d[index]=c;
        
        for(int x:adj.get(index)){
            if(d[x]!=0){
                if(d[x]==c)ans=false;
            }else{
            if(c==1){
            func(x,2,adj,d);
           }else{
            func(x,1,adj,d);
           }
        }
    }
        
    }
    public boolean isBipartite(int V, int[][] edges) {
        int n=edges.length;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int d[]=new int[V];
        Arrays.fill(d,0);
        for(int i=0;i<n;i++){
            int x=edges[i][0];
            int y=edges[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
       
      func(0,1,adj,d);
       
        return ans;
    }
}
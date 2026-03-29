// User function Template for Java
class Solution {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) {
        if(m!=n-1)return false;
       ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
       for(int i=0;i<n;i++){
           adj.add(new ArrayList<>());
       }
        for(int i=0;i<m;i++){
            int x=edges.get(i).get(0);
            int y=edges.get(i).get(1);
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        int v[]=new int[n];
        Arrays.fill(v,0);
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{0,-1});
        v[0]=1;
        int c=0;
        while(!q.isEmpty()){
            int []t=q.poll();
            int node=t[0];
            int par=t[1];
            c++;
            for(int x:adj.get(node)){
             if(v[x]==0){
                 q.offer(new int[]{x,node});
                 v[x]=1;
             }else if(x!=par){return false;
             }
                
            }
        }
        if(c!=n)return false;
        return true;
    }
}

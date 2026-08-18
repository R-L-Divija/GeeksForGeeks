class Solution {
    boolean check(int node,int c,int col[],ArrayList<ArrayList<Integer>>adj){
        for(int e:adj.get(node)){
            if(col[e]==c)return false;
        }
        return true;
    }
    boolean func(int index,int v,int col[],ArrayList<ArrayList<Integer>>adj,int m){
        if(index==v){
            return true;
        }
        for(int c=1;c<=m;c++){
            if(check(index,c,col,adj)){
                col[index]=c;
                if(func(index+1,v,col,adj,m))return true;
                col[index]=0;
            }
        }
        return false;
    }
    boolean graphColoring(int v, int[][] edges, int m) {
        // code here
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int []e:edges){
            int u=e[0];
            int v1=e[1];
            
            adj.get(u).add(v1);
            adj.get(v1).add(u);
        }
        int col[]=new int[v];
        
        return func(0,v,col,adj,m);
    }
}
class Solution {
    ArrayList<Integer>ans;
    public void dfs(int index,ArrayList<ArrayList<Integer>>adj,int v[]){
        ans.add(index);
        v[index]=1;
        for(int x:adj.get(index)){
            if(v[x]==0)dfs(x,adj,v);
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ans=new ArrayList<>();
        int v[]=new int[adj.size()];
        dfs(0,adj,v);
        return ans;
    }
}
class Solution {
    
    void func(int i,ArrayList<ArrayList<Integer>> adj,int v[], ArrayList<Integer>ans){
        ans.add(i);
        v[i]=1;
        
        for(int x:adj.get(i)){
            if(v[x]==0){
                func(x,adj,v,ans);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
    int V=adj.size();
    ArrayList<Integer>ans=new ArrayList<>();
    int v[]=new int[V];
    Arrays.fill(v,0);
    func(0,adj,v,ans);
    return ans;
    }
}
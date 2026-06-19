class Solution {
    public ArrayList<Integer> DSU(int n, int[][] q) {
        ArrayList<Integer>ans=new ArrayList<>();
        int []p=new int[n+1];
        for(int i=0;i<=n;i++){
            p[i]=i;
        }
        for(int i=0;i<q.length;i++){
            if(q[i][0]==2)ans.add(find(q[i][1],p));
            else unite(q[i][1],q[i][2],p);
        }
        return ans;
    }
    public int find(int node,int p[]){
        if(node==p[node])return node;
        return p[node]=find(p[node],p);
    }
    public void unite(int x,int y,int p[]){
        int repx=find(x,p);
        int repy=find(y,p);
        if(repx!=repy){
            p[repx]=repy;
        }else return;
    }
}

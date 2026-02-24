// User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>>ans=new ArrayList<>();
       // List<Integer>temp=new ArrayList<>();
       for(int i=0;i<V;i++){
           ans.add(new ArrayList<>());
       }
      
        for(int i=0;i<edges.length;i++){
           int x=edges[i][0];
           int y=edges[i][1];
           ans.get(x).add(y);
           ans.get(y).add(x);
        }
        return ans;
    }
}
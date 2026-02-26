class Solution {
    
    
    public void func(int index, ArrayList<ArrayList<Integer>> adj,int v[],ArrayList<Integer>temp){
        v[index]=1;
        temp.add(index);
        for(int x:adj.get(index)){
            if(v[x]==0){
                func(x,adj,v,temp);
            }
        }
    }
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int v[]=new int[V];
        Arrays.fill(v,0);
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int x=edges[i][0];
            int y=edges[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        
         ArrayList<Integer>temp;
        // Queue<Integer>q=new LinkedList<>();
       
        for(int i=0;i<V;i++){
            if(v[i]==0){
            //     temp=new ArrayList<>();
            //     q.offer(i);
            //     v[i]=1;
            //     while(!q.isEmpty()){
            //         int val=q.poll();
            //         temp.add(val);
            //         for(int x:adj.get(val)){
            //             if(v[x]==0){
            //             q.add(x);
            //             v[x]=1;
            //             }
            //         }
            //     }
            //      ans.add(temp);
            // 
            temp=new ArrayList<>();
            func(i,adj,v,temp);
            ans.add(temp);
            }
           
        }
        return ans;
    }
}
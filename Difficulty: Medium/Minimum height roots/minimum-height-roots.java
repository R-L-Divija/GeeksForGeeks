class Solution {
    public ArrayList<Integer> minHeightRoot(int n, int[][] edges) {
       ArrayList<Integer>ans=new ArrayList<>();
       if(n==1){
           ans.add(0);
           return ans;
       }
       ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
       int in[]=new int[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int x=edges[i][0];
            int y=edges[i][1];
            in[y]++;
            adj.get(x).add(y);
             in[x]++;
            adj.get(y).add(x);
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(in[i]==1)q.offer(i);
        }
        while(!q.isEmpty()){
            int s=q.size();
            ans=new ArrayList<>();
            while(s-->0){
            int nal=q.poll();
            ans.add(nal);
            for(int x:adj.get(nal)){
                in[x]--;
                if(in[x]==1)q.offer(x);
            }
        }
            }
        
        return ans;
    }
}
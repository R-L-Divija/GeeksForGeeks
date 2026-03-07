/*Complete the function below*/

class Solution {
    // Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X) {
        int v[]=new int[V];
        Arrays.fill(v,0);
        Queue<Integer>q=new LinkedList<>();
        q.offer(0);
        v[0]=1;
        int c=0;
        while(!q.isEmpty()){
            int s=q.size();
            while(s-->0){
                int t=q.poll();
                if(t==X)return c;
                
                for(int x:adj.get(t)){
                    if(v[x]==0){
                        q.offer(x);
                        v[x]=1;
                    }
                }
            }
            c++;
        }
        return -1;
    }
}
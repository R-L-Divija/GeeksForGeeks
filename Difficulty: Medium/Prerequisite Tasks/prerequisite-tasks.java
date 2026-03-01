// User function Template for Java

class Solution {
    public boolean isPossible(int N, int P, int[][] a) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        int in[]=new int[N];
        Arrays.fill(in,0);
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<P;i++){
            int x=a[i][0];
            int y=a[i][1];
            in[y]++;
            adj.get(x).add(y);
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<N;i++){
            if(in[i]==0)
            q.offer(i);
        }
        if(q.isEmpty())return false;
        while(!q.isEmpty()){
            int t=q.poll();
            ans.add(t);
            for(int x:adj.get(t)){
                in[x]--;
                if(in[x]==0)q.offer(x);
            }
        }
        if(ans.size()!=N)return false;
        return true;
    }
}
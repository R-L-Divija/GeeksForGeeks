class Solution {
    public boolean canFinish(int n, int[][]a) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        int in[]=new int[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<a.length;i++){
            int x=a[i][0];
            int y=a[i][1];
            in[y]++;
            adj.get(x).add(y);
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(in[i]==0)q.offer(i);
        }
        if(q.isEmpty())return false;
        while(!q.isEmpty()){
            int val=q.poll();
            ans.add(val);
            for(int x:adj.get(val)){
                in[x]--;
                if(in[x]==0)q.offer(x);
            }
        }
        if(ans.size()!=n)return false;
        return true;
    }
}
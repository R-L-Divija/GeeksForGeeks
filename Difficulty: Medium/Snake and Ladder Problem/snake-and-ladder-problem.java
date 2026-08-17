class Solution {
    public int minThrows(int n, int[] lad, int[] sn) {
        // code here
        int sp=n*n;
        
        int arr1[]=new int[sp+1];
        Arrays.fill(arr1,-1);
        for(int i=0;i<lad.length;i+=2){
            int s=lad[i];
            int e=lad[i+1];
            arr1[s]=e;
        }
       for(int i=0;i<sn.length;i+=2){
            int s=sn[i];
            int e=sn[i+1];
            arr1[s]=e;
        }
        int dis[]=new int[sp+1];
        Arrays.fill(dis,-1);
        
        Queue<Integer>q=new LinkedList<>();
        
        q.add(1);
        dis[1]=0;
        
        while(!q.isEmpty()){
            int u=q.poll();
            if(u==sp)return dis[sp];
            for(int i=1;i<=6;i++){
                int v=u+i;
                if(v>sp)break;
                
                if(arr1[v]!=-1){
                    v=arr1[v];
                }
                
                if(dis[v]==-1){
                    dis[v]=1+dis[u];
                    q.add(v);
                    
                }
            }
        }
        return -1;
        
    }
}
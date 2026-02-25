// User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> mat, int V) {
       ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
       
       for(int i=0;i<V;i++){
           adj.add(new ArrayList<>());
       }
       for(int i=0;i<V;i++){
           for(int j=i+1;j<V;j++){
               if(mat.get(i).get(j)==1){
                   adj.get(i).add(j);
                   adj.get(j).add(i);
               }
           }
       }
       
       
       int c=0;
       int v[]=new int[V];
       Arrays.fill(v,0);
       Queue<Integer>q=new LinkedList<>();
       for(int i=0;i<V;i++){
           if(v[i]==0){
           q.offer(i);
           v[i]=1;
           while(!q.isEmpty()){
            int val=q.poll();
           for(int x:adj.get(val)){
               if(v[x]==0){
                   q.offer(x);
                   v[x]=1;
               }
           }
           
       }c++;
    }
    }
    return c;
    }
}
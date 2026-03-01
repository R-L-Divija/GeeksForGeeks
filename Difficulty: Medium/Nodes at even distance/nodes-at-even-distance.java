// User function Template for Java

class Solution {
    int countOfNodes(ArrayList<ArrayList<Integer>> graph, int n) {
       Queue<Integer>q=new LinkedList<>();
       q.offer(1);
       int cou=0;
       int v[]=new int[n+1];
       Arrays.fill(v,0);
       v[1]=1;
      // v[1]=1;
       int odd=0;
       int even=0;
       while(!q.isEmpty()){
        
         int s=q.size();
            if(cou%2!=0){
             odd+=s;
         }
         else if(cou%2==0){
             even+=s;
         }
         while(s-->0){
         int val=q.poll();
         for(int c:graph.get(val)){
         
             if(v[c]==0){
                 v[c]=1;
                 q.offer(c);
             }
         }
         }
      
         cou++;
       }
       int f1=(odd*(odd-1))/2;
       int f2=(even*(even-1))/2;
       return f1+f2;
    }
}


class Solution {

    public int minCost(int[][] houses) {
       int v[]=new int[houses.length];
       Arrays.fill(v,0);
       PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
       ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
       for(int i=0;i<houses.length;i++){
           adj.add(new ArrayList<>());
       }
       for(int i=0;i<houses.length;i++){
           for(int j=i+1;j<houses.length;j++){
               if(i!=j){
                int dist=Math.abs(houses[i][0]-houses[j][0])+Math.abs(houses[i][1]-houses[j][1]);
              
               adj.get(i).add(new int[]{dist,j});
               adj.get(j).add(new int[]{dist,i});
               }
           }
       }
       int sum=0;
      pq.offer(new int[]{0,0});
      while(!pq.isEmpty()){
          int t[]=pq.poll();
          int dis=t[0];
          int val=t[1];
         
          if(v[val]==0){
              sum+=dis;
              v[val]=1;
          }else continue;
          
          for(int x[]:adj.get(val)){
             int dist=x[0];
              int value=x[1];
              if(v[value]==0){
                  pq.offer(new int[]{dist,value});
              }
              
          }
      }
    return sum;
      
    }
}

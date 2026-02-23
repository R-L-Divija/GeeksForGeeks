class Solution {
    public ArrayList<Integer> findSmallestRange(int[][] mat) {
      ArrayList<Integer>ans=new ArrayList<>();
      PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
      int max=Integer.MIN_VALUE;
      for(int i=0;i<mat.length;i++){
          pq.offer(new int[]{mat[i][0],i,0});
          max=Math.max(max,mat[i][0]);
      }
      int r1=-1,r2=-1,dis=Integer.MAX_VALUE;
        while(pq.size()==mat.length){
            
            int a[]=pq.poll();
            int small=a[0];
            int row=a[1];
            int col=a[2];
            
            if(max-small < dis){
                dis=max-small;
                r1=small;
                r2=max;
            }
            
            if(col+1<mat[row].length){
                max=Math.max(max,mat[row][col+1]);
               pq.offer(new int[]{mat[row][col+1],row,col+1}); 
            }
        }
        ans.add(r1);
        ans.add(r2);
        return ans;
    }
}
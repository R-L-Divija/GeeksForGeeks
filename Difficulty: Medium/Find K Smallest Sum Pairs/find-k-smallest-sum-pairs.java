class Solution {
    public ArrayList<ArrayList<Integer>> kSmallestPair(int[] arr1, int[] arr2, int k) {
    PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
    ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
    ArrayList<Integer>temp;
    int min=Math.min(k,arr1.length);
      for(int i=0;i<min;i++){
        //   for(int j=0;j<k&&arr2.length>=k;j++){
           int s=arr1[i]+arr2[0];
           pq.offer(new int[]{s,i,0});
          }
     
    
     while(!pq.isEmpty()&&k-->0){
         temp=new ArrayList<>();
         int []t=pq.poll();
         int i=(int)t[1];
         int j=(int)t[2];
         
         temp.add(arr1[i]);
         temp.add(arr2[j]);
         ans.add(temp);
         if(j+1<arr2.length){
             int s=arr1[i]+arr2[j+1];
             pq.offer(new int[]{s,i,j+1});
         }
     }
     return ans;
    }
}

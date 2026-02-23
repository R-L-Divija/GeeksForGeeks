// User function Template for Java

class Solution {
    static int toyCount(int N, int K, int arr[]) {
      PriorityQueue<Integer>pq=new PriorityQueue<>();
    int c=0;
       int sum=0;
       for(int x:arr){
           pq.offer(x);
       }
     while(!pq.isEmpty() && sum<=K){
         if(sum+pq.peek()<=K){
             sum+=pq.poll();
             c++;
         }else break;
         
     }
        return c;
    }
}
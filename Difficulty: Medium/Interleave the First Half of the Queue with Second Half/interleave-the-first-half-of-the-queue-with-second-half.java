class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        
      int n=q.size()/2;
      int arr[]=new int[n];
   
      for(int i=0;i<n;i++){
          arr[i]=q.poll();
      }
      for(int i=0;i<n;i++){
          q.add(arr[i]);
          q.add(q.poll());
      }
        
    }
}

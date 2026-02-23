class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        ArrayList<Integer>ans=new ArrayList<>();
       PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int i=0;i<arr.length;i++){
           pq.offer(arr[i]);
       }
       for(int i=0;i<k;i++){
           ans.add(pq.poll());
       }
        return ans;
    }
}

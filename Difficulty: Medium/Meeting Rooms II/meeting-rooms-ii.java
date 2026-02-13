class Solution {
    public int minMeetingRooms(int[] s, int[] e) {
        int n=s.length;
       int arr[][]=new int[n][2];
       for(int i=0;i<n;i++){
           arr[i][0]=s[i];
           arr[i][1]=e[i];
       }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int max=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            while(!pq.isEmpty() &&pq.peek()<=arr[i][0]){
                pq.poll();
            }
            pq.offer(arr[i][1]);
            max=Math.max(max,pq.size());
        }
        return max;
    }
}

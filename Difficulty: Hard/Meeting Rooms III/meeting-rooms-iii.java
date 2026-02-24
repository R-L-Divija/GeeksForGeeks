class Solution {
    public int mostBooked(int n, int[][] arr) {

        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)-> a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]
        );

        PriorityQueue<Integer> fr = new PriorityQueue<>();

        for(int i=0;i<n;i++){
            fr.offer(i);
        }

        int freq[]=new int[n];

        for(int i=0;i<arr.length;i++){
            while(!pq.isEmpty() && pq.peek()[0] <= arr[i][0]){
                fr.offer(pq.poll()[1]);
            }

            if(!fr.isEmpty()){
                int room = fr.poll();
                pq.offer(new int[]{arr[i][1],room});
                freq[room]++;
            }
            else{
                int[] a = pq.poll();
                int dur = arr[i][1] - arr[i][0];
                int newEnd = a[0] + dur;
                int room = a[1];
                pq.offer(new int[]{newEnd,room});
                freq[room]++;
            }
        }

        int ans=0;
        for(int i=1;i<n;i++){
            if(freq[i] > freq[ans]){
                ans=i;
            }
        }

        return ans;
    }
}
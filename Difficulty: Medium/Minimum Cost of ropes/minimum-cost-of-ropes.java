class Solution {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int x:arr){
            pq.offer(x);
        }
        int s=0;
        int s1=0;
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            s=x+y;
            pq.offer(s);
            s1+=s;
        }
        return s1;
    }
}
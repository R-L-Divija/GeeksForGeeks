class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
     PriorityQueue<Integer>minh=new PriorityQueue<>();
     PriorityQueue<Integer>maxh=new PriorityQueue<>(Collections.reverseOrder());
     ArrayList<Double>ans=new ArrayList<>();
     double m=0.0;
     int n=arr.length;
     for(int i=0;i<arr.length;i++){
         maxh.offer(arr[i]);
         
         if(maxh.size()-1==minh.size()){
             if(maxh.size()>1&& maxh.peek()>minh.peek()){
                 int x=maxh.poll();
                 int y=minh.poll();
                 maxh.offer(y);
                 minh.offer(x);
             }
             m=(double)maxh.peek();
             
         }
         else{
             minh.offer(maxh.poll());
             double f=maxh.peek();
             double s=minh.peek();
             m=(f+s)/2.0;
         }
       ans.add(m);
     }
        return ans;
    }
}
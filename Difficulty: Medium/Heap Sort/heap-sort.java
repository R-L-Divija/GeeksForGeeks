class Solution {
    // Function to sort an array using Heap Sort.
//     ArrayList<Integer>heap;
//  void func1(int index,int s){
//      int l=2*index+1;
//      int r=2*index+2;
//      int lv=heap.get(index);
//      int lindex=index;
//      if(l<s&&heap.get(l)>lv){
//          lv=heap.get(l);
//          lindex=l;
//      }
//      if(r<s&&heap.get(r)>lv){
//          lv=heap.get(r);
//          lindex=r;
//      }
//      if(lindex!=index){
   
//         int t=heap.get(lindex);
//         heap.set(lindex,heap.get(index));
//         heap.set(index,t);
//         func1(lindex,s);
//      }
//  }
//     void func(int index){
//         if(index==0)return;
//         int p=(index-1)/2;
//         if(heap.get(p)<heap.get(index)){
//             int t=heap.get(p);
//             heap.set(p,heap.get(index));
//             heap.set(index, t);
//             func(p);
//         }
//     }
    public void heapSort(int arr[]) {
    //   heap=new ArrayList<>();
    //   for(int i=0;i<arr.length;i++){
    //       heap.add(arr[i]);
    //       int s=heap.size();
    //       func(s-1);
    //   }
     
    //     for(int i=arr.length-1;i>=0;i--){
    //          int last=heap.size()-1;
    //          int t=heap.get(0);
    //          heap.set(0,heap.get(last));
    //          heap.set(last,t);
    //          arr[i]=heap.get(last);
    //          heap.remove(heap.size()-1);
    //          func1(0,heap.size());
    //     }

 PriorityQueue<Integer>pq=new PriorityQueue<>();
 for(int i=0;i<arr.length;i++){
     pq.offer(arr[i]);
 }
 for(int i=0;i<arr.length;i++){
     arr[i]=pq.poll();
 }
    }
}
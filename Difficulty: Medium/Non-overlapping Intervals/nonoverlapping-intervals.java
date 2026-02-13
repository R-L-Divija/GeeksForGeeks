class Solution {
    public int minRemoval(int arr[][]) {
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
       Stack<Integer>st=new Stack<>();
       int c=0;
       for(int i=0;i<arr.length;i++){
           if(st.isEmpty()){
               st.push(arr[i][1]);
           }
           else{
               int t=st.peek();
               if(t<=arr[i][0]){
                   st.push(arr[i][1]);
               }else{
                 c++;  
               }
           }
       }
      return c;  
    }
}

// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int n, int[] a) {
        // code here
       
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            //  int s1=a[i];
            boolean des=false;
            if(a[i]>0){
                st.push(a[i]);
            }else{
            int v=Math.abs(a[i]);
            while(!st.isEmpty() && st.peek()>0){
                if(st.peek()<v){
                    st.pop();
                }
                else if(st.peek()==v){
                    st.pop();
                    des=true;
                    break;
                }else{
                    des=true;
                    break;
                }
            }
            if(!des) st.push(a[i]);
      
        }
        }
         int arr[]=new int[st.size()];
         int e=st.size()-1;
        while(!st.isEmpty()){
            arr[e--]=st.pop();
        }
        return arr;
    }

}

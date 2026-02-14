class Solution {
    public int maxProfit(int a[]) {
       Stack<Integer>st=new Stack<>();
       int last=a[0];
       int s=0;
       for(int i=0;i<a.length;i++){
           if(st.isEmpty()){
               st.push(a[i]);
           }else{
               int t=st.peek();
               if(last<=a[i]){
                   last=a[i];
               }else{
                   s+=last-st.pop();
                   st.push(a[i]);
                   last=a[i];
               }
           }
       }
       int t=st.pop();
       if(last>t){
           s+=last-t;
       }
        return s;
    }
}
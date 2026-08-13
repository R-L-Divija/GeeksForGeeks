class Solution {
   
   public static void func(int x, Stack<Integer> st){
      if(st.isEmpty()){
           st.push(x);
           return;
      }
      int y=st.pop();
      func(x,st);
      st.push(y);
     
   }
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty())return;
        
        int x=st.pop();
       
        reverseStack(st);
        func(x,st);
        
        
    }
}

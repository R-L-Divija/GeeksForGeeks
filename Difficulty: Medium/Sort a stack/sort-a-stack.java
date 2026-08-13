class Solution {
    public void func(int x,Stack<Integer> st){
        if(st.isEmpty()||st.peek()<=x){
            st.push(x);
            return;
        }
        int y=st.pop();
        func(x,st);
        st.push(y);
    }
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return ;
        }
        
        int x=st.pop();
        sortStack(st);
        func(x,st);
    }
}
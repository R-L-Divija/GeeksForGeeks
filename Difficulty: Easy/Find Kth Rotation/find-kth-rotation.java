class Solution {
    public int findKRotation(int arr[]) {
        // Code here
    Stack<Integer>st=new Stack<>();
    for(int x:arr){
        if(st.isEmpty())st.push(x);
        else{
        int t=st.peek();
        if(t<x){
            st.push(x);
        }
        }
    }
    if(st.size()==arr.length)return 0;
    return st.size();
    }
}
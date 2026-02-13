class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int s[], int e[]) {
    int n=s.length;
    int arr[][]=new int[n][2];
    for(int i=0;i<n;i++){
        arr[i][0]=s[i];
        arr[i][1]=e[i];
    }
    Stack<Integer>st=new Stack<>();
    Arrays.sort(arr,(a,b)->a[1]-b[1]);
    int c=0;
    for(int i=0;i<n;i++){
    if(st.isEmpty()){
        st.push(arr[i][1]);
        c++;
    }else{
        int t=st.peek();
        if(t<arr[i][0]){
            st.push(arr[i][1]);
            c++;
        }
    }
    }
    return c;
    }
}

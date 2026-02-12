class Solution {
    public int activitySelection(int[] s, int[] f) {
        int [][]a=new int[s.length][2];
        for(int i=0;i<s.length;i++){
            a[i][0]=s[i];
            a[i][1]=f[i];
        }
        Arrays.sort(a,(a1,b1)->a1[1]-b1[1]);
        
        Stack<Integer>st=new Stack<>();
        int c=0;
        for(int i=0;i<s.length;i++){
            if(st.isEmpty()){
                st.push(a[i][1]);
                c++;
            }
            else{
                int top=st.peek();
                if(top<a[i][0]){
                    st.push(a[i][1]);
                    c++;
                }
            }
        }
        return c;
    }
}

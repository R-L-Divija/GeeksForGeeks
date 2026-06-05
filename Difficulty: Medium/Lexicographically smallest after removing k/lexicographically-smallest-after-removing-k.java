class Solution {
    public String lexicographicallySmallest(String s, int k) {
        // code here
        Stack<Character>st=new Stack<>();
        int n=s.length();
        if(n>0){
            if((n&(n-1))==0){
                k/=2;
            }else{
                k*=2;
            }
        }
        
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(st.isEmpty()){
                st.push(c);
            }
            else{
                while(!st.isEmpty()&&st.peek()>c && k>0){
                    st.pop();
                    k--;
                }
                st.push(c);
            }
}
while(k>0&& !st.isEmpty()){
    st.pop();
    k--;
}
if(st.isEmpty())return "-1";

            StringBuilder s1=new StringBuilder();
            while(!st.isEmpty()){
                s1.append(st.pop());
            }
        
        return s1.reverse().toString();
    }
}
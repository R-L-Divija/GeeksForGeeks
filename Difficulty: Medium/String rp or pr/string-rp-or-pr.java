// User function Template for Java

class Solution {
    static String S1;
    static long func(String S,char a,char b,int sum){
        Stack<Character>st=new Stack<>();
        long s=0;
        for(char ch:S.toCharArray()){
            if(st.isEmpty())st.push(ch);
            else{
                char t=st.peek();
                if(t==a&&ch==b){
                    st.pop();
                    s+=sum;
                }else st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        S1=sb.reverse().toString();
        return s;
    }
    static long solve(int X, int Y, String S) {
        if(X>=Y)return func(S,'p','r',X)+func(S1,'r','p',Y);
        else return func(S,'r','p',Y)+func(S1,'p','r',X);
        
    }
}

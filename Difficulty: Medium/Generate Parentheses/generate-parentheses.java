// User function Template for Java

class Solution {
    ArrayList<String>ans;
    StringBuilder temp;
    public void func(int op,int cl,int n){
        if(temp.length()==2*n){
            ans.add(temp.toString());
            return ;
        }
        if(op<n){
            temp.append('(');
            func(op+1,cl,n);
            temp.deleteCharAt(temp.length()-1);
        }
          if(cl<op){
            temp.append(')');
            func(op,cl+1,n);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public ArrayList<String> generateParentheses(int n) {
       ans=new ArrayList<>();
       temp=new StringBuilder();
         if (n % 2 != 0) return ans;  // odd length cannot be balanced

       func(0,0,n/2);
       return ans;
    }
}
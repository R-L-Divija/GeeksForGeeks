class Solution {

public boolean isBalanced(String st) {
  Stack<Character>s=new Stack<>();
  for(int i=0;i<st.length();i++){
      char c=st.charAt(i);
      
    if(c=='{'||c=='['||c=='(')s.push(c);
        else if(c=='}'||c==']'||c==')'){
            if(s.isEmpty())return false;
            if(c=='}' && s.peek()=='{')s.pop();
            else if(c==')' && s.peek()=='(')s.pop();
            else if(c==']'&& s.peek()=='[')s.pop();
            else return false;
        }
     
      
  }
     if(!s.isEmpty())return false;
  return true;
    }
}

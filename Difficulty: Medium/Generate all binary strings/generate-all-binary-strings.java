class Solution {
    ArrayList<String>ans;
    public void func(String s,int n){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        func(s+"0",n);
        func(s+"1",n);
    }
    public ArrayList<String> binstr(int n) {
      ans=new ArrayList<>();
      func("",n);
      return ans;
        
    }
}

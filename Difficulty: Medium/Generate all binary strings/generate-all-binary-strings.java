class Solution {
    ArrayList<String>temp;
    void func(int n,String s){
        if(s.length()==n)
        {
            temp.add(s);
            return;
        }
        func(n,s+"0");
        func(n,s+"1");
    }
    public ArrayList<String> binstr(int n) {
        temp=new ArrayList<>();
        func(n,"");
        return temp;
    }
}

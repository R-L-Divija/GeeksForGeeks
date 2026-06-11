class Solution {
    public int findIndex(String s) {
        int cb=0;
        for(char c:s.toCharArray()){
            if(c==')')cb++;
        }
        int ob=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                if(cb==ob)return i;
                ob++;
            }
            else if(c==')'){
                if(cb==ob)return i;
                cb--;
            }
        }
        if(cb==0 && ob>0)return 0;
        else return s.length();
        
    }
}
class Solution {
    public String func(int p){
        int c=Integer.bitCount(p);
        if(c%2==0)return "Engineer";
        else return "Doctor";
        }
    public String profession(int level, int pos) {
        return func(pos-1);
    }
}
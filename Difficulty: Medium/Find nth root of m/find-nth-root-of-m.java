class Solution {
    public int nthRoot(int n, int m) {
        // code here
        if(m==0)return 0;
        if(n==0)return 1;
        if(n==1)return m;
        int i=1;
        while(i<=9){
            if(Math.pow(i,n)==m)return i;
            i++;
        }
        return -1;
    }
}
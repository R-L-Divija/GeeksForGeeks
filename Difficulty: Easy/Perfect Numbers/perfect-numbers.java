class Solution {
    static boolean isPerfect(int n) {
        // code here
        int s=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                if(i==n/i)s+=i;
                else s+=(i+n/i);
                
            }
        }
        if(s==n)return true;
        return false;
    }
};
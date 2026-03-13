class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int a = n;
        int b = 0;
        while(n!=0){
            b = b*10;
            b = b + n%10;
            n = n/10;
        }
        int ans = power(a,b);
        return ans;
    }
    public int power(int a, int b){
        if(b==0) {
            return 1;
        }
        return a*power(a,b-1);
    }
}


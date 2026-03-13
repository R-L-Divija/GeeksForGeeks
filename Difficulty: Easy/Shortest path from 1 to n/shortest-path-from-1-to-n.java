class Solution {
    public int minStep(int n) {
        // code here
        if(n==1)return 0;
       
        int c=0;
        
        while(n>1){
            if(n%3==0){
           n=n/3;}
           else {
               n=n-1;
           }
           c++;
        }
       
        return c;
    }
}

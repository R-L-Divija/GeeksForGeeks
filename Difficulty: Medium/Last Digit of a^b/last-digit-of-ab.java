class Solution {
    public int func(int a,int b){
        int r=1;
        a=a%10;
        while(b>0){
            if((b&1)==1)r=(r*a)%10;
            a=(a*a)%10;
            b>>=1;
        }
       
        return r;
    }
    public int getLastDigit(String a, String b) {
        if(b.equals("0"))return 1;
       int a1=a.charAt(a.length()-1)-'0';
       int r=1;
       for(char x:b.toCharArray()){
           int d=x-'0';
           r=func(r,10);
           r=(r* func(a1,d))%10;
       }
      return r; 
    }
};
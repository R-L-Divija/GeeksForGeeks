class Solution {
    public long func(long a,int b,int limit){
        long r=1;
        while(b>0){
            if((b&1)==1){
                
                r*=a;
               if(r>limit)return limit+1; 
            }
                
            a*=a;
            if(a>limit)a= limit+1; 
            b>>=1;
        }
        return r;
    }
    public int nthRoot(int n, int n2) {
        if(n2==0)return 0;
        int l=1;
        int r=n2;
        while(l<=r){
            int m=l+(r-l)/2;
            long pow=func(m,n,n2);
            if(pow==n2)return m;
            else if(pow< n2)l=m+1;
            else r=m-1;
        }
        return -1;
        
    }
}
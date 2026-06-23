class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n1=a.length;
        int n2=b.length;
        
        if(n1>n2)return kthElement(b,a,k);
        
        int l=Math.max(0,k-n2);
    
        int r=Math.min(k,n1);
        
        while(l<=r){
            
            int c1=l+(r-l)/2;
            int c2=k-c1;
            
        int l1=(c1==0)?Integer.MIN_VALUE:a[c1-1];
        int r1=(c1==n1)?Integer.MAX_VALUE:a[c1];

        int l2=(c2==0)?Integer.MIN_VALUE:b[c2-1];
        int r2=(c2==n2)?Integer.MAX_VALUE:b[c2];
        
        if(l1<=r2 && l2<=r1){
            return Math.max(l1,l2);
        }else if(l1>r2)r=c1-1;
        else l=c1+1;
            
            
        }
        return 0;
    }
}
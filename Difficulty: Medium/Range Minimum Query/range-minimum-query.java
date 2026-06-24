/* The functions which
builds the segment tree */
class GfG {
    static int st[];

    public static int[] constructST(int arr[], int n) {
        // Add your code here
        st=new int[2*n];
        for(int i=0;i<n;i++){
            st[i+n]=arr[i];
        }
        for(int i=n-1;i>0;i--){
            st[i]=Math.min(st[2*i],st[2*i+1]);
        }
        return st;
    }

    /* The functions returns the
      min element in the range
      from l and r */
    public static int RMQ(int st[], int n, int l, int r) {
        // Add your code here
        l+=n;
        r+=n;
        int min=Integer.MAX_VALUE;
        while(l<=r){
            if((l&1)==1){
                min=Math.min(st[l],min);
                l++;}
            if((r&1)==0){
                min=Math.min(st[r],min);
                r--;
                }
                l/=2;
                r/=2;
        }
        return min;
    }
}
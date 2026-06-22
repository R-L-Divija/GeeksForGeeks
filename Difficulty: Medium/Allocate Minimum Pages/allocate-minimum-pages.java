class Solution {
    public boolean func(int a[],int k,int m){
        int s=0;
        int t=1;
        for(int x:a){
            if(x>m)return false;
            if(s+x<=m){
                s+=x;
            }else{
                t++;
                s=x;
            }
        }
       
        return t<=k;
    }
    public int findPages(int[] arr, int k) {
        if(arr.length<k)return -1;
       int l=0;
       int r=0;
       int a=-1;
       for(int x:arr){
           l=Math.max(l,x);
           r+=x;
       }
       
       while(l<=r){
           
           int m=l+(r-l)/2;
           if(func(arr,k,m)){
               a=m;
               r=m-1;
           }else l=m+1;
       }
        return a;
    }
}
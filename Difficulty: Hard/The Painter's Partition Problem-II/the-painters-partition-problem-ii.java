class Solution {
    public boolean func(int arr[],int k,int m){
        int s=0;
        int t=1;
        for(int x:arr){
            if(s+x<=m)s+=x;
            else {
                t++;
                s=x;
            }
        }
        return t<=k;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int l=0;
        int r=0;
        for(int x:arr){
            l=Math.max(x,l);
            r+=x;
        }
        int ans=0;
        while(l<=r){
            int m=l+(r-l)/2;
            if(func(arr,k,m)){
                ans=m;
                r=m-1;
            }else l=m+1;
        }
        return ans;
    }
}

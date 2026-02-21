class Solution {
    public boolean func(int[] a,int k,int m){
        int c=1;
        int l=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-l>=m){
                c++;
                l=a[i];
            }
        }return c>=k;
    }
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
       int l=1;
       int h=stalls[stalls.length-1]-stalls[0];
       int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(func(stalls,k,m)){
                ans=m;
                l=m+1;
            }else h=m-1;
        }
        return ans;
    }
}
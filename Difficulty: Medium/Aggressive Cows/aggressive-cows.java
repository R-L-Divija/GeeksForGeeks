class Solution {
    public boolean func(int a[],int k, int m){
        int c=1;
        int l=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-l>=m){
                c++;
                l=a[i];
            }
        }
        return c>=k;
    }
    public int aggressiveCows(int[]a, int k) {
        Arrays.sort(a);
        int ans=0;
        int l=1;
        int h=a[a.length-1]-a[0];
        while(l<=h){
            int mid=l+(h-l)/2;
            if(func(a,k,mid)){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
}
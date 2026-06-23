class Solution {
    public int func(int a[],int k){
        int l=0;
        int r=a.length-1;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(a[m]<=k){
                ans=m;
                l=m+1;}
            else r=m-1;
        }return ans+1;
        
    }
    public int median(int[][] mat) {
        int l=Integer.MAX_VALUE;
        int r=Integer.MIN_VALUE;
        
        
        int n=mat.length;
        int m1=mat[0].length;
        
        for(int i=0;i<mat.length;i++){
            l=Math.min(l,mat[i][0]);
            r=Math.max(r,mat[i][m1-1]);
        }
        
        int pos=(n*m1)/2;
        
        while(l<r){
            int m=l+(r-l)/2;
            int s=0;
            for(int i=0;i<mat.length;i++){
                s+=func(mat[i],m);
            }
            if(s<=pos)l=m+1;
            else r=m;
        }
        return l;
    }
}
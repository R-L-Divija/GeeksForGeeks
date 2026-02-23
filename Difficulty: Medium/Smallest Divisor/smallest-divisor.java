class Solution {
    boolean func(int []arr,int k,int m){
        int s=0;
        for(int x:arr){
           s+=(x+(m-1))/m;
        }
        return s<=k;
    }
    int smallestDivisor(int[] arr, int k) {
       int l=1;
       int  h=0;
       for(int x:arr){
           h=Math.max(h,x);
       }
       while(l<h){
           int m=l+(h-l)/2;
           if(func(arr,k,m)){
               h=m;
           }else
           {
               l=m+1;
           }
       }
       return l;
    }
}
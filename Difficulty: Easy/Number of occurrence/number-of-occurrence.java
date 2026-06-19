class Solution {
    int countFreq(int[] arr, int t) {
       int l=0;
        int r=arr.length-1;
        
        int i=-1;
        while(l<=r){
           int m=l+(r-l)/2;
           if(arr[m]==t){
            i=m;
            r=m-1;
           }else if(arr[m]<t) l=m+1;
           else r=m-1;
        }
        
    int j=-1;
     l=0;
     r=arr.length-1;
        while(l<=r){
           int m=l+(r-l)/2;
           if(arr[m]==t){
            j=m;
            l=m+1;
           }else if(arr[m]<t) l=m+1;
           else r=m-1;
        }
        if(i==-1&&j==-1)return 0;
        return  j-i+1;
    }
}

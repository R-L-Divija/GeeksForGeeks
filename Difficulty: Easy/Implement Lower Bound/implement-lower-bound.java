class Solution {
    int lowerBound(int[] arr, int t) {
      int l=0;
      int r=arr.length-1;
      int ans=arr.length;
      while(l<=r){
          int m=l+(r-l)/2;
          if(arr[m]>=t){
          ans=m;
          r=m-1;
          }
          else l=m+1;
      }
       return ans; 
    }
}

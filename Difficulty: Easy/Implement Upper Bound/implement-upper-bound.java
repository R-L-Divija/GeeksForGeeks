class Solution {
    int upperBound(int[] arr, int target) {
      int l=0;
      int r=arr.length-1;
      int ans=r;
      while(l<=r){
          int mid=(l+r)/2;
          if(arr[mid]>target){
                 ans=mid-1;
                 r=mid-1;
           
          }
          else{
                l=mid+1;
            
          }
      }
       return ans+1; 
    }
}

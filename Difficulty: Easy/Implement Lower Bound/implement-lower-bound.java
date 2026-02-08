class Solution {
    int lowerBound(int[] arr, int target) {
        int l=0;
        int r=arr.length-1;
        int ans=r+1;
        while(l<=r){
           int mid=(l+r)/2;
            if(arr[mid]>=target){
                ans=Math.min(ans,mid);
                r=mid-1;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
        }
        return ans;
    }
}

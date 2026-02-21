class Solution {
    public int binarysearch(int[] arr, int k) {
        int ans=-1;
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==k){
               ans=mid; 
               h=mid-1;
            }
            else if(arr[mid]<k){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
}
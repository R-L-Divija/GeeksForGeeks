class Solution {
    public int findKRotation(int arr[]) {
        // Code here
    int l=0;
    int r=arr.length-1;
    
    while(l<r){
        int m=l+(r-l)/2;
        if(arr[m]>arr[r])l=m+1;
        else r=m;
    }
    return l;
    }
}
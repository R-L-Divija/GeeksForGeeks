// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int l=0;
        int r=arr.length-1;
        int i=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]>=x){
                i=m;
                r=m-1;
            }else l=m+1;
        }
        return i;
    }
}

// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int l=0;
        int h=arr.length-1;
        while(l<h){
            int m=l+(h-l)/2;
            if(arr[m]>arr[m+1]){
                h=m;
            }
            else l=m+1;
        }
        return arr[l];
    }
}
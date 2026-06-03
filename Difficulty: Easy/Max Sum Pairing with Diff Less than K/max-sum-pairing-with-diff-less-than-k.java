class Solution {
    public int sumDiffPairs(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int res=0;
        int n=arr.length;
        int l=n-2,r=n-1;
        while(l>=0){
            if(arr[r]-arr[l]<k){
                res+=arr[r]+arr[l];
                r=l-1;
                l=r-1;
            }else{
                l--;
                r--;
            }
        }
        return res;
        
    }
}
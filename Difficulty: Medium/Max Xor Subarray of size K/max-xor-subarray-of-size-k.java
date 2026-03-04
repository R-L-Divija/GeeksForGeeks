class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
       int s=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<k;i++){
           s^=arr[i];
       }
       max=Math.max(max,s);
       for(int i=k;i<arr.length;i++){
           s=s^arr[i]^(arr[i-k]);
           max=Math.max(max,s);
       }
       return max;
        
    }
}

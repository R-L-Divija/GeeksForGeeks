class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int a[]=new int[arr.length];
       a[0]=1;
       //prefix
       for(int i=1;i<arr.length;i++){
           a[i]=a[i-1]*arr[i-1];
       }
       //suffix
       int r=1;
       for(int i=arr.length-1;i>=0;i--){
           a[i]=a[i]*r;
           r*=arr[i];
       }
       return a;
    }
}

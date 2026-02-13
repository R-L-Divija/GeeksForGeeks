class Solution {
    public int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
     int n=arr.length;
     int s=arr[0]+k;
     int g=arr[n-1]-k;
     int output=arr[n-1]-arr[0];
     for(int i=0;i<n-1;i++){
         int min=Math.min(s,arr[i+1]-k);
         int max=Math.max(g,arr[i]+k);
         if(min<0)continue;
         output=Math.min(output,max-min);
     }
     return output;
    }
}

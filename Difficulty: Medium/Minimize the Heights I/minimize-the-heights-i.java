// User function Template for Java
class Solution {
    public int getMinDiff(int[] arr, int k) {
        int n=arr.length;
       Arrays.sort(arr);
       int s=arr[0]+k;
       int g=arr[n-1]-k;
       int ans=arr[n-1]-arr[0];
       for(int i=0;i<n-1;i++){
           int min=Math.min(s,arr[i+1]-k);
           int max=Math.max(g,arr[i]+k);
          // if(min<0)continue;
           ans=Math.min(ans,max-min);
       }
       return ans;
        
    }
}
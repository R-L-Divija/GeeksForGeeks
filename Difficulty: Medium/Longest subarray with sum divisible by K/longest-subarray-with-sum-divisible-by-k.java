// User function Template for Java

class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
      HashMap<Integer,Integer>map=new HashMap<>();
      long s=0;
      int max=0;
      map.put(0,-1);
      for(int i=0;i<arr.length;i++){
          s+=arr[i];
          int r=(int)(s%k);
          if(r<0)r=r+k;
          if(map.containsKey(r)){
             max=Math.max(max,i-map.get(r));
          }else {
              map.put(r,i);
          }
      }
      return max;
    }
}

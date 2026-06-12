// User function Template for Java

class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
 HashMap<Integer,Integer>map=new HashMap<>();
 map.put(0,-1);
 long s=0;
 int max=0;
 for(int i=0;i<arr.length;i++){
     s=s+arr[i];
     int r=(int)(s%k);
     if(r<0)r+=k;
     if(map.containsKey(r)){
         int l=i-map.get(r);
         max=Math.max(max,l);
         
     }else{
         map.put(r,i);
     }
 }return max;
 
    }
}

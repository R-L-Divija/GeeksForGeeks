// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
     HashMap<Integer,Integer>map=new HashMap<>();
     
     int s=0;
     int max=0;
     
     for(int r=0;r<arr.length;r++){
         s+=arr[r];
         if(s==k){
             max=r+1;
         }
         if(map.containsKey(s-k)){
             int l= r-map.get(s-k);
             max=Math.max(max,l);
         }
         if(!map.containsKey(s)){
             map.put(s,r);
         }
     }
    
      return max;
    }
}

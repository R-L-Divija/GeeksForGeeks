// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
    HashMap<Integer,Integer>map=new HashMap<>();
    map.put(0,1);
    int s=0;
    int len=0;
    for(int r=0;r<arr.length;r++){
        s+=arr[r];
        if(s==k){
        len=r+1;
        }
      if(map.containsKey(s-k)){
          len=Math.max(len,r-map.get(s-k));
      }
      map.putIfAbsent(s,r);
    }
    
  return len;
        
    }
}

class Solution {
    public int maxDistance(int[] arr) {
       HashMap<Integer,Integer>map=new HashMap<>();
       int max=0;
       for(int i=0;i<arr.length;i++){
           if(!map.containsKey(arr[i]))map.put(arr[i],i);
       
           else{
               max=Math.max(max,i-map.get(arr[i]));
        
           }
    }
       
       return max;
        
    }
}
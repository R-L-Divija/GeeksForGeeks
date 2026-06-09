class Solution {
    public int mostFreqEle(int[] arr) {
       HashMap<Integer,Integer>map=new HashMap<>();
       int mf=0;
       int mv=0;

    for(int i=0;i<arr.length;i++){
         if(!map.containsKey(arr[i])){
             map.put(arr[i],1);
         }
         else{
             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
         }
             if(mf<map.get(arr[i])){
                 mf=map.get(arr[i]);
                 mv=arr[i];
             }else if(mf==map.get(arr[i])){
                  
                 mv=Math.max(mv,arr[i]);
             }
  
    }
    return mv;
    }
}
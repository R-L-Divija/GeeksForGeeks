class Solution {
    public int minRemove(int[] arr1, int[] arr2) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
       
        for(int x:arr1){
            if(!map.containsKey(x))map.put(x,1);
            else map.put(x,map.getOrDefault(x,0)+1);
        }
        int c=0;
       for(int x:arr2){
           if(map.containsKey(x)&&(map.get(x)>0)){
               map.put(x,map.getOrDefault(x,0)-1);
               c++;
           }
       }
        return c;
    }
}

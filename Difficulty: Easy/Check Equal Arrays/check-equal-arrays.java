class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:a){
            if(!map.containsKey(x))map.put(x,1);
            else map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x:b){
            if(!map.containsKey(x))return false;
            if(map.get(x)-1>0){
            map.put(x,map.get(x)-1);
            continue;
            }
            map.remove(x);
        }
        return true;
    }
}
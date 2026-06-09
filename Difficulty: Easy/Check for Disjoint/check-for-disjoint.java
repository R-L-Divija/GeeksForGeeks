// User function Template for Java
class Solution {
    public boolean areDisjoint(int[] a, int[] b) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:a){
            if(map.containsKey(x))map.put(x,map.getOrDefault(x,0)+1);
            else map.put(x,1);
        }
        for(int x:b){
            if(map.containsKey(x))return false;
        }
        return true;
    }
}

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer>map=new HashMap<>();
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int x:a){
            if(map.containsKey(x))map.put(x,map.getOrDefault(x,0)+1);
            else map.put(x,1);
        }
        for(int x:b){
             if(mp.containsKey(x))mp.put(x,mp.getOrDefault(x,0)+1);
             else mp.put(x,1);
        }
        for(int x:b){
            if(!map.containsKey(x)||map.get(x)<mp.get(x))return false;
           
        }
        return true;
    }
}

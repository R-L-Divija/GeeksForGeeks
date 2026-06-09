class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        ArrayList<Integer>p=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:a){
            if(!map.containsKey(x))map.put(x,1);
            else map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x:b){
            if(map.containsKey(x))p.add(x);
            map.remove(x);
        }
        return p;
    }
}
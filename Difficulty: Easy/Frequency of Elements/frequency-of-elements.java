class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int x:arr){
           if(!map.containsKey(x))map.put(x,1);
           else map.put(x,map.getOrDefault(x,0)+1);
       }
       ArrayList<Map.Entry<Integer,Integer>>list=new ArrayList<>(map.entrySet());
      
       ArrayList<ArrayList<Integer>>p=new ArrayList<>();
       for(Map.Entry<Integer,Integer> m:list){
            ArrayList<Integer>ans=new ArrayList<>();
           ans.add(m.getKey());
           ans.add(m.getValue());
           p.add(ans);
       }
        return p;
    }
}
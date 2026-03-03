class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
  ArrayList<Integer> list= new ArrayList<> ();
        HashMap<Integer,Integer> map= new HashMap<> ();
        for(int a :arr)
        {
          map.put(a,map.getOrDefault(a,0)+1);   
        }
        for(int key : map.keySet())
        {
            if(map.get(key) %2 == 1)
            {
                list.add(key);
            }
        }
       Collections.sort(list,Collections.reverseOrder());
       return list;
    }
}

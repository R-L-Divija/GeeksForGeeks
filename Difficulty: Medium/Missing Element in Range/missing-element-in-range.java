class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer>p=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(!map.containsKey(x))map.put(x,1);
            else map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int i=low;i<=high;i++){
            if(!map.containsKey(i))p.add(i);
        }
        return p;
    }
}
// User function Template for Java
class Solution {
    public int findDuplicate(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(!map.containsKey(x))map.put(x,1);
            else map.put(x,map.getOrDefault(x,0)+1);
        }
        int max=0;
        int v=-1;
        for(int i=0;i<arr.length;i++){
            if(max<map.get(arr[i])){
                max=map.get(arr[i]);
                v=arr[i];
            }
        }
        return v;
    }
}
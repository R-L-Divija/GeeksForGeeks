// User function Template for Java
class Solution {
    int countPairs(int[] arr, int k) {
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int x:arr){
        if(!map.containsKey(x))map.put(x,1);
        else map.put(x,map.getOrDefault(x,0)+1);
    }
    int c=0;
    for(int i=0;i<arr.length;i++){
       int t=k+arr[i];
       if(map.containsKey(t)){
           c+=map.get(t);
       }
    }
    return c;
    }
}
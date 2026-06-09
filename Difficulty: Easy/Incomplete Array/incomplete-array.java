// User function Template for Java

class Solution {
    int countElements(int[] arr) {
        // code here
        int max=0;
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(!map.containsKey(x))map.put(x,1);
            else map.put(x,map.getOrDefault(x,0)+1);
            max=Math.max(max,x);
            min=Math.min(min,x);
        }
        int t=max-min-map.size()+1;
        return t;
        
    }
}
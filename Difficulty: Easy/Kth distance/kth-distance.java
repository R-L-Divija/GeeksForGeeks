// User function Template for Java

class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i]))map.put(arr[i],i);
            else{
                if(i-map.get(arr[i])<=k)return true;}
                 
        }
        return false;
    }
}
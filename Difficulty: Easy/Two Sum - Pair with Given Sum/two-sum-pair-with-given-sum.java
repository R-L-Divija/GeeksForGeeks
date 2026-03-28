class Solution {
    boolean twoSum(int arr[], int target) {
      
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int v=target-arr[i];
            if(map.containsKey(v))return true;
            else {
                map.put(arr[i],i);
            }
        }
        return false;
        
    }
}
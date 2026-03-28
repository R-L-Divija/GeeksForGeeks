class Solution {
    int countPairs(int arr[], int target) {
        // code here
        int c=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int r=0;r<arr.length;r++){
            int t=target-arr[r];
            if(map.containsKey(t)){
                c+=map.get(t);
                
            }
             map.put(arr[r],map.getOrDefault(arr[r],0)+1);
        }
        return c;
    }
}
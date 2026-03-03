class Solution {
    int majorityElement(int arr[]) {
        // code here
           HashMap<Integer,Integer> hs =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
            if(hs.get(arr[i])>arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }
}
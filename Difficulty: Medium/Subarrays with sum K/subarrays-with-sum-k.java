class Solution {
    public int cntSubarrays(int[] arr, int k) {
HashMap<Integer,Integer>map=new HashMap<>();
map.put(0,1);
int s=0;
int c=0;
for(int i=0;i<arr.length;i++){
    s+=arr[i];
    c+=map.getOrDefault(s-k,0);
    map.put(s,map.getOrDefault(s,0)+1);
}return c;
        
    }
}
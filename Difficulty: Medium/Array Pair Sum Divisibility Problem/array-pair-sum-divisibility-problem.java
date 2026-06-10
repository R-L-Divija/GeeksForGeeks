class Solution {
    public boolean canPair(List<Integer> arr, int k) {
        // code here.
        if(arr.size()%2!=0)return false;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            int r=((x%k)+k)%k;
            if(!map.containsKey(r))map.put(r,1);
            else map.put(r,map.getOrDefault(r,0)+1);
        }
        for(int i=0;i<arr.size();i++){
            int r=(((arr.get(i))%k)+k)%k;
            if(2*r==k){
                if((map.get(r)%2)==1)return false;
            }
            else if(r==0){
               if((map.get(r)%2)==1)return false; 
            }
            else{
                if(map.get(k-r)!=map.get(r))return false;
            }
        }
        return true;
    }
}

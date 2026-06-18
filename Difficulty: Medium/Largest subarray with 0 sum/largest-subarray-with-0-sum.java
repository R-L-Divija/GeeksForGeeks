class Solution {
    int maxLength(int a[]) {
     HashMap<Integer,Integer>map=new HashMap<>();
     map.put(0,-1);
     int mx=0;
     int s=0;
     for(int i=0;i<a.length;i++){
         s+=a[i];
         if(s==0){
             mx=i+1;
         }
         else{
             if(map.containsKey(s)){
                 mx=Math.max(mx,i-map.get(s));
             }else map.put(s,i);
         }
     }
     return mx;
    }
}
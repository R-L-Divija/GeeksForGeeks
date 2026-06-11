class Solution {
    public boolean kSubstr(String s, int k) {
        // code here
        if(s.length()%k!=0)return false;
        HashMap<String,Integer>map=new HashMap<>();
      
        for(int i=0;i<s.length();i+=k){
            String s1=s.substring(i,i+k);
            if(map.containsKey(s1)){
            map.put(s1,map.getOrDefault(s1,0)+1);}
            else map.put(s1,1);
        }
        if(map.size()==1)return true;
        if(map.size()>2)return false;
        Iterator<Integer> f=map.values().iterator();
        
        int a=f.next();
        int b=f.next();
        return a==1||b==1;
        
        
    }
}
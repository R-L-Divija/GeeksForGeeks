class Solution {
    public static int func(String s,int k){
        HashMap<Character,Integer>map=new HashMap<>();
        int l=0;
      
        int c1=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size()>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0)map.remove(s.charAt(l));
                
                l++;
            }
            c1+=i-l+1;
            
        }
        return c1;
    }
    public static int countSubstring(String s) {
        // code here
        return func(s,3)-func(s,2);
    }
}

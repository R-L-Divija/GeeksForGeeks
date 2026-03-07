class Solution {
    int func(String s,int k){
        HashMap<Character,Integer>map=new HashMap<>();
        int l=0;
        int c=-1;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
              
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
             if(map.size()==k){
         c=Math.max(c,r-l+1);
        }
           
        }
       return c;
    }
    public int longestKSubstr(String s, int k) {
        // code hee
        return func(s,k);
    }
}
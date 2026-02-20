class Solution {
    public int longestKSubstr(String s, int k) {
       int l=0;
       int r=0;
       int ans=0;
       HashMap<Character,Integer>map=new HashMap<>();
       while(r<s.length()){
           map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
           while(map.size()>k){
               map.put(s.charAt(l),map.get(s.charAt(l))-1);
               if(map.get(s.charAt(l))==0)map.remove(s.charAt(l));
               l++;
           }
           ans=Math.max(ans,r-l+1);
           r++;
       }
        if(map.size()==k)return ans;
        return -1;
    }
}
class Solution {
    public int maxChildren(int[] g, int[] c) {
        Arrays.sort(g);
        Arrays.sort(c);
      
        int i=0;
        int j=0;
         while(i<g.length && j<c.length){
             if(c[j]>=g[i]){
              
                 i++;
                 
             }
                 j++;
         }
        return i;
    }
}
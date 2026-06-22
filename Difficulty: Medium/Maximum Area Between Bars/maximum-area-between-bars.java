class Solution {
    public int maxArea(List<Integer> h) {
        int l=0;
        int r=h.size()-1;
        int max=Integer.MIN_VALUE;
        while(l<=r){
            int h1=Math.min(h.get(l),h.get(r));
            int h2=r-l-1;
            
            int a=h1*h2;
            max=Math.max(max,a);
            if(h.get(l)<h.get(r))l++;
            else r--;
        }
        return max;
        
    }
}
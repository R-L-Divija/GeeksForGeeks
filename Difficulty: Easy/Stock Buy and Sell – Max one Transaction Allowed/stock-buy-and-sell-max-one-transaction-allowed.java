class Solution {
    public int maxProfit(int[] a) {
        int min=Integer.MAX_VALUE;
        int max=0;
        int p=0;
        for(int i=0;i<a.length;i++){
            min=Math.min(min,a[i]);
            p=a[i]-min;
              max=Math.max(max,p);
        }
       
 
        return max;
    }
}
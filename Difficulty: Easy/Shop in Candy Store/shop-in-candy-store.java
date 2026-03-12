class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
    int n=prices.length;
    Arrays.sort(prices);
    int min=0;
    int max=0;
    int l=0,r=n-1;
    while(l<=r){
        min+=prices[l];
        l++;
        r-=k;
    }
    l=0;
    r=n-1;
    while(l<=r){
        max+=prices[r];
        r--;
        l+=k;
    }
       ArrayList<Integer>res=new ArrayList<>();
       res.add(min);
       res.add(max);
       return res;
    }
}

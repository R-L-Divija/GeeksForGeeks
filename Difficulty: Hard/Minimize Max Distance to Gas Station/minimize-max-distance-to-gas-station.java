class Solution {
    public boolean func(int s[],int K,double m){
        int t=0;
        for(int i=1;i<s.length;i++){
          int gap=s[i]-s[i-1];
          t+=(int)Math.ceil(gap/m)-1;
        }
        return t<=K;
    }
    public double minMaxDist(int[] s, int K) {
       double l=0.0;
       double r=s[s.length-1]-s[0];
       double ans=0.0;
       while(r-l>1e-6){
           double mid=l+(r-l)/2.0;
           if(func(s,K,mid)){
             
               r=mid;
           }else l=mid;
       }
       return r;
    }
}

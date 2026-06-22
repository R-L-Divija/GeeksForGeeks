class Solution {
    public boolean func(int s[],int k,int m){
        int c=1;
        int prev=s[0];
        for(int i=1;i<s.length;i++){
            if(s[i]-prev>=m){
                c++;
                prev=s[i];
            }
        }
        return c>=k;
    }
    public int aggressiveCows(int[] s, int k) {
        Arrays.sort(s);
       int l=1;
       int r=s[s.length-1]-s[0];
       int a=0;
       while(l<=r){
         int m=l+(r-l)/2;
         if(func(s,k,m)){
             a=m;
             l=m+1;
         }else r=m-1;
       }
        return a;
    }
}
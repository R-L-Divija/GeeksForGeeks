class Solution {
    public boolean func(int m,int p){
        long s=0;
        for(int i=0;i<m;i++){
            long sq=i*i;
            s+=sq;
        }
        return s<p;
    }
    int maxPeopleDefeated(int p) {
        // code here
        // int l=1;
        // int r=p;
        // int ans=0;
        // while(l<=r){
        //     int m=l+(r-l)/2;
        //     if(func(m,p)){
        //         ans=m;
        //         l=m+1;
        //     }else r=m-1;
        // }
        // return ans;
        int i=1;
        
        int s=0;
        while(s<=p){
            s+=(i*i);
            i++;
        }
        return i-2;
    }
};
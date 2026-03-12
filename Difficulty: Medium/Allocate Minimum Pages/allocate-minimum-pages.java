class Solution {
    public boolean func(int arr[],int k,int m){
        int s=1;
        int p=0;
       for(int x:arr){
           if(x>m)return false;
           if(x+p<=m)p+=x;
           else {
               s++;
               p=x;
           }
       }
        return s<=k;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length)return -1;
        int l=0;
        int h=0;
        int ans=0;
        for(int x:arr){
            l=Math.max(l,x);
            h+=x;
        }
        while(l<h){
            int m=l+(h-l)/2;
            if(func(arr,k,m)){
                
                h=m;
            }
            else l=m+1;
            }
            return l;
    }
}
class Solution {
    public boolean func(int a[],int k,int m){
        int p=0;
        int s=1;
        for(int x:a){
            if(x>m)return false;
            if(p+x<=m){
              
                p+=x;
            }else{
                  s++;
                  p=x;
            }
        }
        return s<=k;
    }
    public int findPages(int[] arr, int k) {
        if(k>arr.length)return-1;
  int l=0;
  int h=0;
  for(int x:arr){
      l=Math.max(l,x);
      h+=x;
  }
  while(l<h){
      int m=l+(h-l)/2;
     if(func(arr,k,m)){
         h=m;
     }else l=m+1;
  }
   return l;
    }
}
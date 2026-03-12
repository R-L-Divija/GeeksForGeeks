
class Solution {
    public static int func1(int arr[],int k){
        int l=0;
        int h=arr.length-1;
        
         while(l<=h){
             int m=l+(h-l)/2;
             if(arr[m]<k){
                
                 l=m+1;
             }else{
                 h=m-1;            
                 }
         }
         return l;
    }

    public static int findClosest(int[] arr, int k) {
        int index=func1(arr,k);
        if(index==0)return arr[0];
        if(index==arr.length)return arr[arr.length-1];
        
        int nxg=arr[index];
        int nxs=arr[index-1];
        int diff1=Math.abs(k-nxg);
         int diff2=Math.abs(k-nxs);
     if(diff1<=diff2)return nxg;
     else return nxs;
     
    }
}

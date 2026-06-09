class Solution {
    public boolean func(int arr[],int t){
    int l=0;
    int r=arr.length-1;
    while(l<=r){
        int m=l+(r-l)/2;
        if(t==arr[m])return true;
        else if(t<arr[m])r=m-1;
        else l=m+1;
    }
    return false;
    }
    public int binarySearchable(int[] arr) {
int c=0;
for(int x:arr){
    if(func(arr,x))c++;
}
   return c;     
    }
};
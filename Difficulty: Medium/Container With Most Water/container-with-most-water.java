class Solution {
    public int maxWater(int arr[]) {
       int l=0;
       int r=arr.length-1;
       int area=0;
       while(l<=r){
           
          int min=Math.min(arr[l],arr[r]);
          int w=r-l;
          area=Math.max(area,min*w);
          if(arr[l]<arr[r])l++;
          else r--;
          
          
       }
       return area; 
    }
}
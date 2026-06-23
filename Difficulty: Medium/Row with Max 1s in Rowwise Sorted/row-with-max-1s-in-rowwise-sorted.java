class Solution {
    public int rowWithMax1s(int[][] arr) {
    int index=-1;
    int l=0;
    int r=arr[0].length-1;
    
    while(l<arr.length && r>=0){
        
        if(arr[l][r]==1){
            index=l;
            r--;
        }else l++;
    }
      return index;  
    }
};
class Solution {
    public boolean canServe(int[] arr) {
        int sum=0;
        int n1=0;
        int n2=0;
        int n3=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==5){
            n1++;
           }
           else if(arr[i]==10){
               if(n1!=0){
               n1--;
               n2++;
               }else{
                   return false;
               }
              
           }
           else{
               if(n2!=0 &&n1 !=0){
                   n2--;
                   n1--;
               }else if( n1>=3){
                   n1--;
                   n1--;
                   n1--;
               }
               else{
                   return false;
               }
               n3++;
           }
       }
      return true;
       
    }
}
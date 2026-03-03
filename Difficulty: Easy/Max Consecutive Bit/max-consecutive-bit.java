class Solution {
    public int maxConsecBits(int[] arr) {
 int count = 0;
        int count_0=0;
        int max=0;
        int max_0=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1){
                count++;
            
            if(count >max)
            {
                max = count ;
            }
            }
             
        else {
            count = 0;
        }
         if(arr[i]==0){
                count_0++;
            
            if(count_0>max_0)
            {
                max_0 = count_0;
            }
            }
            
            else {
                count_0=0;
            }
        }
      
        return max>max_0?max:max_0;
    }
}

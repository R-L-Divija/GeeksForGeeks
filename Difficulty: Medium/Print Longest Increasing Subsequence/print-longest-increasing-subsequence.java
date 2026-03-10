class Solution {
    public ArrayList<Integer> getLIS(int arr[]) {
        ArrayList<Integer>ans=new ArrayList<>();
       int dp[]=new int[arr.length+1];
       Arrays.fill(dp,1);
       int prev[]=new int[arr.length+1];
       Arrays.fill(prev,-1);
      
       for(int i=1;i<arr.length;i++){
           for(int j=0;j<i;j++){
               if(arr[j]<arr[i] &&dp[i]<dp[j]+1){
                   dp[i]=dp[j]+1;
                   prev[i]=j;
               }
           }
       }
       int index=-1,max=-1;
       for(int i=0;i<arr.length;i++){
           if(dp[i]>max){
               max=dp[i];
               index=i;
           }
       }
       while(index!=-1){
           ans.add(arr[index]);
           index=prev[index];
       }
       Collections.reverse(ans);
       return ans; 
    }
}

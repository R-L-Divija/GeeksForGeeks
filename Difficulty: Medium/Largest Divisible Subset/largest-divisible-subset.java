class Solution {
    public ArrayList<Integer> largestSubset(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        int dp[]=new int[arr.length];
        Arrays.fill(dp,1);
        
        int prev[]=new int[arr.length];
        Arrays.fill(prev,-1);
       
        Arrays.sort(arr);
    for(int i=0;i<arr.length/2;i++){
    int temp = arr[i];
    arr[i] = arr[arr.length-1-i];
    arr[arr.length-1-i] = temp;
}
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]%arr[i]==0 &&dp[i]<dp[j]+1){
                   dp[i]=dp[j]+1;
                    prev[i]=j;
                   
                }
            }
        }
        int max=-1,index=-1;
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
        //Collections.reverse(ans);
        return ans;
    }
}
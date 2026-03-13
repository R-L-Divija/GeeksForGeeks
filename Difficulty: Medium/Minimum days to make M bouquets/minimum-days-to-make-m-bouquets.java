class Solution {
    public int minDaysBloom(int[] arr, int k, int m) {
        // code here
        int n=arr.length;
        
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        
        for(int day : arr){
            low=Math.min(low,day);
            high=Math.max(high,day);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            boolean isPossible=canMake(arr,k,m,mid);
            if(isPossible){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
        
        
    }
    static boolean canMake(int[] arr,int k, int m, int day){
            int flo=0, bou=0;
            for(int curday : arr){
                if(curday <= day){
                    flo++;
                    if(flo==k){
                        bou++;
                        flo=0;
                    }
                }else{
                    flo=0;
                }
            }
            if(bou<m) return false;
            else return true;
        }
}  
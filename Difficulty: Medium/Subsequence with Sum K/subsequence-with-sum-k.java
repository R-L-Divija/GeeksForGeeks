class Solution {
    
    public boolean func(int a[],int index,int sum,int k){
        if(sum==k)return true;
        if(index==a.length||sum>k)return false;
        if(func(a,index+1,sum+a[index],k))return true;
         if(func(a,index+1,sum,k))return true;
     return false;
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        boolean v=func(arr,0,0,k);
        return v;
        
    }
}
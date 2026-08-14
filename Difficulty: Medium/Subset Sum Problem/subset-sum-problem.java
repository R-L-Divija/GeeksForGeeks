class Solution {
    static boolean func(int arr[],int s,int index,int t){
        if(s==t)return true;
        if(s>t ||index==arr.length)return false;
        if(func(arr,s+arr[index],index+1,t))return true;
        if(func(arr,s,index+1,t))return true;
        return false;
        
    }
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        return func(arr,0,0,sum);
    }
}
// User function Template for Java

class Solution {
    
    public static boolean check(int index,int sum,int[] arr,int k){
        if(sum == k) return true;
if(index == arr.length || sum > k) return false;

        //take
        if(check(index+1,sum+arr[index],arr,k))return true;
        //not teake
        if(check(index+1,sum,arr,k))return true;
        return false;
    }
    public static boolean checkSubsequenceSum(int N, int[] arr, int k) {
      
      boolean v=check(0,0,arr,k);
     return v;
        
    }
}

class Solution {
      public static boolean isLucky(int n)
    {
        return !checkLucky(n, 2);
    }
    
    public static boolean checkLucky(int n, int k){
        
        if(n < k){
            return false;
        }
        
        return checkLucky(n - n/k, k+1) || n %k == 0;
        
    }
}
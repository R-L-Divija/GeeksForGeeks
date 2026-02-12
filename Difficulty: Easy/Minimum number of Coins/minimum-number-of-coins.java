class Solution {
    public int findMin(int n) {
    
    int ans=0;
    int rem=0;
    
     rem=n/10;
     n=n%10;
     ans+=rem;
     
    rem=n/5;
     n=n%5;
     ans+=rem;
     rem=n/2;
     n=n%2;
     ans+=rem;
     rem=n/1;
     n=n%1;
     ans+=rem;
      return ans;  
    }
}
